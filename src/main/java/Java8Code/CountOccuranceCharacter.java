package Java8Code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccuranceCharacter {

    public static void main(String[] args)
    {
        String s1 ="sana";
        String s2[]=s1.split("");
        ArrayList<String> al=new ArrayList<>(Arrays.asList(s2));
        Map<String, Long> collect = al.stream().collect(Collectors.groupingBy(Function.identity(),
                Collectors.counting()));
        System.out.println(collect);



    }
}
