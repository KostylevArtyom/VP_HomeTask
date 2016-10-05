package VP_HomeTask;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void testTriangleCorrect() throws Exception {
        Triangle triangle = new Triangle(3, 4, 5);
        Assert.assertEquals(6, triangle.countArea(), Utils.DELTA);
    }

    @Test(expected = ArithmeticException.class)
    public void testTriangleNegativeSizeA() throws Exception {
        new Triangle(-1, 4, 5);
    }

    @Test(expected = ArithmeticException.class)
    public void testTriangleNegativeSizeB() throws Exception {
        new Triangle(3, -1, 5);
    }

    @Test(expected = ArithmeticException.class)
    public void testTriangleNegativeSizeC() throws Exception {
        new Triangle(3, 4, -1);
    }

    @Test(expected = ArithmeticException.class)
    public void testTriangleSizeABiggerThanOthers() throws Exception {
        new Triangle(7.5, 4, 3);
    }

    @Test(expected = ArithmeticException.class)
    public void testTriangleSizeBBiggerThanOthers() throws Exception {
        new Triangle(3, 7.5, 4);
    }

    @Test(expected = ArithmeticException.class)
    public void testTriangleSizeCBiggerThanOthers() throws Exception {
        new Triangle(3, 4, 7.5);
    }
}