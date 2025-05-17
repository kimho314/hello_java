package nested;

public class ShadowingMain {

    public int value = 1;

    class Inner {

        public int value = 2;

        void go() {
            int value = 3;
            System.out.println("value = " + value);
            System.out.println("this.value = " + this.value);
            System.out.println("ShadowingMain.this.value = " + ShadowingMain.this.value);
        }
    }

    /**
     * go() 메서드의 경우 지역 변수인 value가 가장 가깝다. 따라서 우선순위가 가장 높다. 이렇게 다른 변수들을 가려서 보이지 않게 하는 것을 shadowing이라고
     * 한다.
     */
    public static void main(String[] args) {
        ShadowingMain main = new ShadowingMain();
        Inner inner = main.new Inner();
        inner.go();
    }
}
