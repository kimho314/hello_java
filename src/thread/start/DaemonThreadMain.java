package thread.start;

public class DaemonThreadMain {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main() start");
        DaemonThread daemonThread = new DaemonThread();
//        daemonThread.setDaemon(true); // 데몬 스레드 여부
        // 데몬 스레드 여부를 true로 함녀 DaemonThread 실행이 끝날 때까지 main thread가 종료되지 않는다.
        daemonThread.setDaemon(false);
        daemonThread.start();
        System.out.println(Thread.currentThread().getName() + ": main() end");
    }


    static class DaemonThread extends Thread {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ": run() start");
            try {
                Thread.sleep(10000); // 10초간 실행
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + ": run() end");
        }
    }
}
