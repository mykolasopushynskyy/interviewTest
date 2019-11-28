import org.apache.commons.lang3.tuple.Pair;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class MainTest {

    @Test
    public void reverse() {
        assertEquals("54321", Main.reverse("12345"));
        assertEquals("", Main.reverse(""));
        assertNull(Main.reverse(null));
    }

    @Test
    public void arrayTest() {
        int[] A;
        int[] B;
        int EXPECTED_SUM = 100;
        List<Pair<Integer, Integer>> result;

        // test corner cases
        A = new int[]{50, 100};
        B = new int[]{50};
        assertNull(Main.findPairs(null, B, EXPECTED_SUM));
        assertNull(Main.findPairs(A, B, EXPECTED_SUM));
        assertNull(Main.findPairs(A, null, EXPECTED_SUM));
        assertNull(Main.findPairs(null, null, EXPECTED_SUM));

        // test single pair
        A = new int[]{50};
        B = new int[]{50};
        result = Main.findPairs(A, B, EXPECTED_SUM);
        assertResult(EXPECTED_SUM, 1, result);

        // test single pair
        A = new int[]{100};
        B = new int[]{0};
        result = Main.findPairs(A, B, EXPECTED_SUM);
        assertResult(EXPECTED_SUM, 1, result);

        // test single pair
        A = new int[]{200};
        B = new int[]{-100};
        result = Main.findPairs(A, B, EXPECTED_SUM);
        assertResult(EXPECTED_SUM, 1, result);

        // test multiple pairs
        A = new int[]{37, 63, 45, 20};
        B = new int[]{80, 55, 50, 63};
        result = Main.findPairs(A, B, EXPECTED_SUM);
        assertResult(EXPECTED_SUM, 3, result);
    }

    private void assertResult(int expectedSum, int expectedSize, List<Pair<Integer, Integer>> result) {
        assertEquals(expectedSize, result.size());
        result.forEach(p -> {
            assertEquals(expectedSum, p.getLeft() + p.getRight());
            System.out.print(String.format("pair %4s %4s\n", p.getLeft(), p.getRight()));
        });
        System.out.println("");
    }
}