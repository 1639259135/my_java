package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main02 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("name","老王");
        map.put("job","乞丐");
        map.put("age",100);

        for (Object o : map.keySet()) {
            System.out.println(map.get(o).toString());
        }

        Set set = map.entrySet();
        for (Object o : set) {
            Map.Entry entry = (Map.Entry) o;
            System.out.println(" key= " + entry.getKey() + "\t" + "value = " + entry.getValue());
        }

        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            Map.Entry entry = (Map.Entry) next;
            System.out.println(" key= " + entry.getKey() + "\t" + "value = " + entry.getValue());
        }

        for (Object o : map.values()) {
            System.out.println(o);
        }



    }
}
