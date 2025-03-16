package Java8Code;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartingOne {
    public static void main(String[] args) {
        int[] a1 = {10, 15, 18, 20};
        List<String> collect = Arrays.stream(a1).boxed().map(String::valueOf).filter(e -> e.startsWith("1")).collect(Collectors.toList());
        System.out.println(collect);
    }
}
