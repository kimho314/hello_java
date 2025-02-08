package collection.set;

public class MyHashSetV0Main {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        MyHashSetV0 set = new MyHashSetV0();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        System.out.println(set);
        long end = System.currentTimeMillis();
        System.out.println("duration = " + (end - start) + " millis");

        boolean result = set.add(5);
        System.out.println("종복 데이터 저장 결과 = " + result);
    }
}
