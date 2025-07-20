package Practise;

import java.util.LinkedHashSet;
import java.util.Set;

public class duplicateelementarray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 4, 5, 5, 6, 7};

        Set<Integer> ss = new LinkedHashSet<>();

        for (int num : arr) {
            ss.add(num);
        }
        int[] newar = new int[ss.size()];
        int i = 0;
        System.out.println(ss);

    }
}
