package Java8Code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateElement {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>(Arrays.asList(1,2,3,4,4,5,677));
        HashSet<Integer> al=new HashSet<>();
        List<Integer> collect = arrayList.stream().filter(I ->! al.add(I)).collect(Collectors.toList());
        System.out.println(collect);
    }
}
