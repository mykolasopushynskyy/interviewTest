import jdk.internal.net.http.common.Pair;
import org.apache.commons.lang3.ArrayUtils;

public class Main {

    public static void main(String[] args) {
        System.out.println(reverse("12345"));
    }

    public static String reverse(String str) {
        if(str == null)
            return null;

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {
            result.append(str.charAt(str.length() - i - 1));
        }

        return result.toString();
    }

    public static Pair<Integer, Integer>[] arrayFind(int [] a, int [] b, int sum ) {
        return null;
    }
}



