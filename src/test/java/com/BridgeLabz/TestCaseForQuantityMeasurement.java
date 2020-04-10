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
    public void givenZeroFootAndZeroInche_WhenBothSame_ShouldRerturnEqual()
    {
        int foot = 0;
        int inches = 0;
        boolean totalLength = quantityMeasurement.calLength(foot,inches);
        Assert.assertEquals(true,totalLength);
    }

}
