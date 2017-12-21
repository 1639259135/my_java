package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("name","张三");
        map.put("job","doctor");
        map.put("age",10);

        first(map);
        System.out.println();
        second(map);
        System.out.println();
        third(map);
        System.out.println();
        four(map);


    }

    private static void four(Map map) {
        for (Object o : map.values() ) {
            System.out.println("value = " + o);
        }
    }

    private static void first(Map map) {
        for (Object o : map.keySet()){
            System.out.println(map.get(o).toString());
        }
    }

    private static void third(Map map) {
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            Map.Entry entry = (Map.Entry) next;

            System.out.println("key = " + entry.getKey() + "\t" + "value = " + entry.getValue());
        }
    }

    private static void second(Map map) {
                Set set = map.entrySet();
        for (Object o : set){
            Map.Entry entry = (Map.Entry) o;
            System.out.println("kye = " + entry.getKey() + "\t" + "value = " + entry.getValue());
        }
    }
}
