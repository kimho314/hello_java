package nested.nested.ex2;


public class Network {

    public void sendMessage(String text) {
        new NetworkMessage(text).print();
    }

    private static class NetworkMessage {

        private String content;

        public NetworkMessage(String content) {
            this.content = content;
        }

        public void print() {
            System.out.println(content);
        }
    }
}
