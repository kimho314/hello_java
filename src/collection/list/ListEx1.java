package collection.list;

import java.util.ArrayList;

public class ListEx1 {

    public static void main(String[] args) {
        ArrayList<Integer> students = new ArrayList<>();
        students.add(90);
        students.add(80);
        students.add(70);
        students.add(60);
        students.add(50);

        int total = students.stream().mapToInt(x -> x).sum();
        double average = (double) total / students.size();
        System.out.println("total score: " + total);
        System.out.println("average score: " + average);
    }

}
