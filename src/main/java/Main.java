import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(reverse("12345"));
    }

    //reverse string
    public static String reverse(String str) {
        if (str == null)
            return null;

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            result.append(str.charAt(str.length() - i - 1));
        }

        return result.toString();
    }

    //find pairs
    public static List<Pair<Integer, Integer>> findPairs(int[] a, int[] b, int sum) {
        // input validation
        if (a == null)
            return null;
        if (b == null)
            return null;
        if (a.length != b.length)
            return null;

        int length = a.length;

        List<Pair<Integer, Integer>> result = new ArrayList<>();
        HashMap<Integer, Integer> search = new HashMap<>();

        // add the array1 elements as map keys
        for (int i = 0; i < length; i++) {
            search.put(a[i], i);
        }

        // check if array2 elements has a pair inside
        // hashmap keys(array1 elements) which form the sum we need
        for (int i = 0; i < length; i++) {
            if (search.containsKey(sum - b[i])) {
                result.add(Pair.of(sum - b[i], b[i]));
            }
        }

        return result;
    }
}



