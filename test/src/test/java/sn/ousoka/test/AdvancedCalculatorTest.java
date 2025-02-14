package sn.ousoka.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AdvancedCalculatorTest  {
    
    private AdvancedCalculator advancedCalculator;
    
    @Before
    public void setUp() {
        advancedCalculator = new AdvancedCalculator();
    }

    @Test
    public void testRacineCarre() {
        double result = advancedCalculator.RacineCarre(4);
        Assert.assertEquals(2.0, result, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRacineCarreNegative() {
        advancedCalculator.RacineCarre(-4);
    }

    @Test
    public void testRacineCarreAdd2() {
        double result = advancedCalculator.RacineCarreAdd2(2, 2);
        Assert.assertEquals(2.0, result, 0.0);
    }
    
    @Test
    public void Puissance(){
        int result = advancedCalculator.Puissance(2, 3);
        Assert.assertEquals(8, result);
    }

    @Test
    public void testAddPuissance2() {
        int result = advancedCalculator.AddPuissance2(2, 1, 2, 1);
        Assert.assertEquals(4, result);
    }

    // @Test(expected=IllegalArgumentException.class)
    // public void TestPuissanceAdd(){
    //     advancedCalculator.AddPuissance2(0, -1, 2, 1);
    // }
    
    
}
