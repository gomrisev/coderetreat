package com.coderetreat;

import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {

    @Test
    public void stringCalculator1() {
        
        StringCalculator stringCalculator = new StringCalculator();
        Assert.assertEquals(0, stringCalculator.Add(""));
    }

    @Test
    public void stringCalculator2() {
        
        StringCalculator stringCalculator = new StringCalculator();
        Assert.assertEquals(1, stringCalculator.Add("1"));
    }

    @Test
    public void stringCalculator3() {
        
        StringCalculator stringCalculator = new StringCalculator();
        Assert.assertEquals(3, stringCalculator.Add("1,2"));
    }

    @Test
    public void stringCalculator4() {
        
        StringCalculator stringCalculator = new StringCalculator();
        Assert.assertEquals(0, stringCalculator.Subtract(""));
    }
}
