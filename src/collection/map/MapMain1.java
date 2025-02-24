package collection.map;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapMain1 {

    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap();

        studentMap.put("studentA", 90);
        studentMap.put("studentB", 80);
        studentMap.put("studentC", 70);
        studentMap.put("studentD", 60);
        System.out.println(studentMap);

        Integer result = studentMap.get("studentB");
        System.out.println(result);

        Set<String> keySet = studentMap.keySet();
        System.out.println(keySet);

        Collection<Integer> values = studentMap.values();
        System.out.println(values);
        values.stream().sorted(Comparator.comparing(it -> it)).forEach(System.out::println);

        Set<Entry<String, Integer>> entries = studentMap.entrySet();
        for (Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
