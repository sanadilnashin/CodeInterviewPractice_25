package CoreJavaCodes.Collection;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {
    public static void main(String[] args) {
        Map<String,String> h1=new ConcurrentHashMap<>();
        h1.put("aman","pachi");
        h1.put("sana","dhnbd");
        Iterator<String> iterator=h1.keySet().iterator();

            while (iterator.hasNext()) {
              h1.get(iterator.next());
                System.out.println(h1);
                h1.remove("aman");
            }


    }
}
