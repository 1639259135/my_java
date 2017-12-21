package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main04 {
    public static void main(String[] args) {
        Map map = new HashMap();

        map.put("name","王麻子");
        map.put("age",10);
        map.put("job","student");

        for (Object o : map.keySet()){
            System.out.println(map.get(o).toString());
        }

        Set set = map.entrySet();
        for (Object o : set){
            Map.Entry entry = (Map.Entry) o;
            System.out.println("key = " + entry.getKey() + "\t" + "value = " + entry.getValue());
        }

        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            Map.Entry entry = (Map.Entry) next;
            System.out.println("key = " + entry.getKey() + "\t" + "value = " + entry.getValue());
        }






    }
}
