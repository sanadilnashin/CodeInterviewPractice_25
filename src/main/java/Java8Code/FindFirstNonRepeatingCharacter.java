package Java8Code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatingCharacter {
    public static void main(String [] args)
    {
        String s1="sanasa";
        //split->make collection->
        String[] split = s1.split("");
        ArrayList<String> al=new ArrayList<>(Arrays.asList(split));
        String key = al.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream().filter(I -> I.getValue() == 1).findFirst().get().getKey();
        System.out.println(key);

    }
}
