package lang.object.immutable.address;

public class RefMain1_3 {
    public static void main(String[] args) {
        Address a = new Address("서울");
        Address b = a; // 개발자에게 side-effect 발생 시킴
//        Address b = new Address("서울");;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        change(b, "부산");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    private static void change(Address address, String changeAddress){
        System.out.println("주소 값을 변경했습니다. -> " + changeAddress);
        address.setValue(changeAddress);
    }
}
