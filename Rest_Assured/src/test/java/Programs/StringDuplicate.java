package Programs;

import java.util.HashMap;

public class StringDuplicate {



        public static void main(String[] args) {
            String s = "Programming";

            HashMap<Character, Integer> map = new HashMap<>();

            for (char a : s.toCharArray()) {
                map.put(a, map.getOrDefault(a, 0) + 1);


            }
            for (char a : map.keySet()) {
                if (map.get(a) > 1)
                    System.out.println(a + " " + map.get(a));


            }


        }

}
