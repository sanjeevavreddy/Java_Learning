import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Learn_Maps {


    public static void main(String[] args) {
        Map<Integer,String> maps= new HashMap<>();

        maps.put(1,"nheritence.A");
        maps.put(2,"nheritence.B");
        maps.put(3,"C");
        maps.put(1,"A1");
        maps.put(2,"B1");
        maps.put(3,"C1");
        maps.put(4,"D");

//        Set keys =maps.keySet();
//        for (Object key:keys)
//        System.out.println(maps.get(key));

        Set<Map.Entry<Integer,String>> entries = maps.entrySet();

        for(Map.Entry<Integer,String> entry : entries)
        {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }


    }
}
