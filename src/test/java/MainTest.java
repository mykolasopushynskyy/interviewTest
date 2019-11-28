import jdk.internal.net.http.common.Pair;
import org.junit.Test;
import org.apache.commons.lang3.ArrayUtils;
import static org.junit.Assert.*;

//TODO mailto:yaroslav.tanko@globallogic.com

public class MainTest {

    @Test
    public void reverse() {
        assertEquals("54321", Main.reverse("12345"));
        assertEquals("", Main.reverse(""));
        assertNull(Main.reverse(null));
    }

    @Test
    public void arrayTest() {
        int [] a;
        int [] b;
        int SUM = 100;

        assertArrayEquals(new int[][]{{50}, {50}}, Main.arrayFind(new int[]{50}, new int[] {50}, SUM));
        assertArrayEquals(new int[][]{{}}, Main.arrayFind(new int[]{51}, new int[] {50}, SUM));
    }

}