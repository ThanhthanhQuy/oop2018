package week3;
import org.junit.Test;
import static org.junit.Assert.*;

public class Week3Test {
    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void TestMax() { assertEquals(4, Week3.max(3, 4)); }
    @Test
    public void TestMax1() {
        assertEquals(0, Week3.max(0, 0));
    }
    @Test
    public void TestMax2() {
        assertEquals(-5, Week3.max(-5, -5));
    }
    @Test
    public void TestMax3() {
            assertEquals(3334, Week3.max(3334, 5));
        }
    @Test
        public void TestMax4() {
        assertEquals(4, Week3.max(-4,4));
    }

    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
        public void TestminOfArray1() {
        int[] arr = {1, 2, 3, 4};
        assertEquals(1, Week3.minOfArray(arr));
    }
    @Test
    public void TestminOfArray2() {
        int[] arr1 = {-4};
        assertEquals(-4, Week3.minOfArray(arr1));
    }
    @Test
    public void TestminOfArray3() {
        int[] arr2 = {-1, -1, -1, -1};
        assertEquals(-1, Week3.minOfArray(arr2));
    }
    @Test
    public void TestminOfArray4() {
        int[] arr3 = {5, 6, 3, -5, 6, 0};
        assertEquals(-5, Week3.minOfArray(arr3));
    }
    @Test
    public void TestminOfArray5() {
        int[] arr4={57,315,227,1333,44,89,123,44,56};
        assertEquals(44,Week3.minOfArray(arr4));

    }
    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    @Test
    public void TestcalculateBMI1() {
        assertEquals("Thừa cân", Week3.calculateBMI(51.75, 1.5));
    }
    @Test
    public void TestcalculateBMI2() {
        assertEquals("Thiếu cân", Week3.calculateBMI(33, 1.54));
    }
    @Test
    public void TestcalculateBMI3() {
        assertEquals("Bình thường", Week3.calculateBMI(49, 1.54));
    }
    @Test
    public void TestcalculateBMI4() {
        assertEquals("Béo phì", Week3.calculateBMI(90, 1.54));
    }
    @Test
    public void TestcalculateBMI5() {
        assertEquals(null, Week3.calculateBMI(-70,0));
    }


}
