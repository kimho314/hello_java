package collection.array;

public class MyArrayListV4Main {
    public static void main(String[] args) {
        MyArrayListV4<String> list = new MyArrayListV4<>();
        System.out.println("==데이터 추가==");
        System.out.println(list);
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        System.out.println("addLast");
        list.add(3, "addLast");
        System.out.println(list);

        System.out.println("addFirst");
        list.add(0, "addFirst");
        System.out.println(list);

        Object remove1 = list.remove(4); //O(1)
        System.out.println("remove(4) = " + remove1);
        System.out.println(list);

        Object remove2 = list.remove(0); // O(n)
        System.out.println("remove(0) = " + remove2);
        System.out.println(list);
    }
}
