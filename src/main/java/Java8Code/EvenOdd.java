package Java8Code;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOdd {
    public static void main(String [] args)
    {
        //even odd
        List<Integer> arrayList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<String, List<Integer>> collect = arrayList.stream().collect(Collectors.groupingBy(I -> I % 2 == 0 ? "even" : "odd"));
        System.out.println(collect);
    }
}
