package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain3 {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("studentA", 50);
        System.out.println(map);
        System.out.println();

        // 학생이 없는 경우에만 추가
        map.putIfAbsent("studentA", 10);
        map.putIfAbsent("studentB", 10);
        System.out.println(map);
        System.out.println();
        map.computeIfAbsent("studentC", k -> 10);
        System.out.println(map);

    }
}
