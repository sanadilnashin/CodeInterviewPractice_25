package CoreJavaCodes;

import java.util.HashSet;
import java.util.Set;

public class HashCodeTest {
    public static void main(String[] args) {
      /*  Collection Type	hashCode() Depends On	Order Matters for hashCode()	equals() Comparison
        HashSet	Elements only	❌ No	✅ Content only
        LinkedHashSet	Elements only	❌ No	✅ Content only
        TreeSet	Elements only	❌ No	✅ Content only
        ArrayList	Elements + Order	✅ Yes	✅ Content + Order
        LinkedList	Elements + Order	✅ Yes	✅ Content + Order
        HashMap	Key-value pairs	❌ No	✅ Key-value pairs
        TreeMap	Key-value pairs	❌ No	✅ Key-value pairs*/

        Set<String> s=new HashSet<>();
        s.add("abc");
        s.add("c");
        Set<String> s1=new HashSet<>();
        s1.add("abc");
        s1.add("c");
        System.out.println(s.hashCode()+" "+ s1.hashCode());
    }
}
