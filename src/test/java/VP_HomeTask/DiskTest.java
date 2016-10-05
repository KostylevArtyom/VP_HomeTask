package VP_HomeTask;

import org.junit.Assert;
import org.junit.Test;

public class DiskTest {
    @Test
    public void testDiskCorrect() throws Exception {
        Disk disk = new Disk(2);
        Assert.assertEquals(4 * Math.PI, disk.countArea(), Utils.DELTA);
    }

    @Test(expected = ArithmeticException.class)
    public void testDiskNegativeRadius() throws Exception {
        new Disk(-1);
    }
}