package VP_HomeTask;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {
    @Test
    public void testRectangleCorrect() throws Exception {
        Rectangle rectangle = new Rectangle(2, 3);
        Assert.assertEquals(6, rectangle.countArea(), Utils.DELTA);
    }

    @Test(expected = ArithmeticException.class)
    public void testRectangleNegativeSizeA() throws Exception {
        new Rectangle(-1, 1);
    }

    @Test(expected = ArithmeticException.class)
    public void testRectangleNegativeSizeB() throws Exception {
        new Rectangle(1, -1);
    }
}