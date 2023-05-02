package com.coderetreat;

import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {

    @Test
    public void stringCalculator1() {
        
        StringCalculator stringCalculator = new StringCalculator();
        Assert.assertEquals(0, stringCalculator.Add(""));
    }
}
