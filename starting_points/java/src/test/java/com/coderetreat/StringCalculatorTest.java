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

    @Test
    public void stringCalculator5() {
        
        StringCalculator stringCalculator = new StringCalculator();
        Assert.assertEquals(1, stringCalculator.Subtract("1"));
    }

    @Test
    public void stringCalculator6() {
        
        StringCalculator stringCalculator = new StringCalculator();
        Assert.assertEquals(-1, stringCalculator.Subtract("1,2"));
    }

    @Test
    public void stringCalculator7() {
        
        StringCalculator stringCalculator = new StringCalculator();
        Assert.assertEquals(0, stringCalculator.Multiply(""));
    }

    @Test
    public void stringCalculator8() {
        
        StringCalculator stringCalculator = new StringCalculator();
        Assert.assertEquals(1, stringCalculator.Multiply("1"));
    }

    @Test
    public void stringCalculator9() {
        
        StringCalculator stringCalculator = new StringCalculator();
        Assert.assertEquals(2, stringCalculator.Multiply("1,2"));
    }

    @Test
    public void stringCalculator10() {
        
        StringCalculator stringCalculator = new StringCalculator();
        Assert.assertEquals(0, stringCalculator.Divide(""));
    }
}
