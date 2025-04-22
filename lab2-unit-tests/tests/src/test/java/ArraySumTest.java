import org.junit.Test;
import static org.junit.Assert.*;

public class ArraySumTest {
    @Test
    public void testSumArrayBasic() {
        int[] arr = {1, 2, 3};
        assertEquals(6, ArraySum.sumArray(arr));
    }

    @Test
    public void testSumArrayEmpty() {
        int[] arr = {};
        assertEquals(0, ArraySum.sumArray(arr));
    }

    @Test
    public void testSumArrayNegative() {
        int[] arr = {-1, -2, 3};
        assertEquals(0, ArraySum.sumArray(arr));
    }
}