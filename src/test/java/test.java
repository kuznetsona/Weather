import org.junit.Assert;
import org.junit.Test;

public class test {

    @Test
    public void testTemperatureFtoC() {
        Assert.assertEquals(Main.temperatureFtoC(1), -17.2, 0.05);
        Assert.assertEquals(Main.temperatureFtoC(90), 32.2,0.05);
        Assert.assertEquals(Main.temperatureFtoC(-451.3), -268.5,0.05);
        Assert.assertEquals(Main.temperatureFtoC(0), -17.8,0.05);
        Assert.assertEquals(Main.temperatureFtoC(65), 18.3,0.05);
    }

    @Test
    public void testTemperatureCtoF() {
        Assert.assertEquals(Main.temperatureCtoF(1), 33.8, 0.05);
        Assert.assertEquals(Main.temperatureCtoF(90), 194.0,0.05);
        Assert.assertEquals(Main.temperatureCtoF(-451.3), -780.34,0.05);
        Assert.assertEquals(Main.temperatureCtoF(0), 32,0.05);
        Assert.assertEquals(Main.temperatureFtoC(65), 18.3,0.05);
    }

    @Test
    public void testCheckCorrect() {
        Assert.assertTrue(Main.checkCorrect("C"));
        Assert.assertTrue(Main.checkCorrect("F"));
        Assert.assertFalse(Main.checkCorrect("f"));
        Assert.assertFalse(Main.checkCorrect("c"));
        Assert.assertFalse(Main.checkCorrect("Ф"));
        Assert.assertFalse(Main.checkCorrect("йцук"));
        Assert.assertFalse(Main.checkCorrect("1101"));
    }

    @Test
    public void testCheckCorr() {
        Assert.assertTrue(Main.checkCorr("0"));
        Assert.assertTrue(Main.checkCorr("1"));
        Assert.assertTrue(Main.checkCorr("11.01"));
        Assert.assertTrue(Main.checkCorr("-20.01"));
        Assert.assertFalse(Main.checkCorr("1."));
        Assert.assertFalse(Main.checkCorr("1.1.1.1"));
        Assert.assertFalse(Main.checkCorr("привет!"));
        Assert.assertFalse(Main.checkCorr("11-1+2"));
    }
}
