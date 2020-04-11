package com.BridgeLabz;

import org.junit.Assert;
import org.junit.Test;

public class TestCaseForQuantityMeasurement
{
    QuantityMeasurement quantityMeasurement =  new QuantityMeasurement();

    @Test
    public void givenFootNInch_WhenProper_ShouldRetuenProperConversion()
    {
        int foot = 1;
        double inches = 12;
        double totalLength = quantityMeasurement.calculateLength(foot,inches);
        Assert.assertEquals(12,totalLength,0.0);
    }

    @Test
    public void givenZeroFootAndZeroFoot_WhenBothSame_ShouldRerturnEqual()
    {
        int foot = 0;
        int foot1 = 0;
        boolean totalLength = quantityMeasurement.calLength(foot,foot1);
        Assert.assertEquals(true,totalLength);
    }
    @Test
    public void givenNull_ToBoth_ShouldReturnTrue()
    {
        boolean value = quantityMeasurement.equals(null);
        boolean value1 = quantityMeasurement.equals(null);
        Assert.assertEquals(value,value1);
    }

    @Test
    public void givenValueForEquality_WhenBothSame_ThnenShouldReturnTrue()
    {
        int foot = 5;
        int foot1 = 5;
        boolean result = quantityMeasurement.calLength(foot,foot1);
        Assert.assertEquals(true,result);
    }
}
