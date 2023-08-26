package day23_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C10_ArrayListten_Array {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("tavsan");
        list.add("horoz");

        System.out.println(list);  // [tavsan, horoz]

        String arr[ ] = list.toArray(list.toArray(new String[0]));

        System.out.println(arr.length); // 2
        System. out .println(Arrays. toString (arr)); // [tavsan,horoz]
    }
}
