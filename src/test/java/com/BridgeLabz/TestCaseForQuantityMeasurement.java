package com.BridgeLabz;

import org.junit.Assert;
import org.junit.Test;

public class TestCaseForQuantityMeasurement
{
    QuantityMeasurement quantityMeasurement =  new QuantityMeasurement();

    @Test
    public void givenFeetNInch_WhenProper_ShouldRetuenProperConversion()
    {
        int feet = 1;
        double inches = 12;
        double totalLength = quantityMeasurement.calculateLength(feet,inches);
        Assert.assertEquals(12,totalLength,0.0);
    }

    @Test
    public void givenZeroFeetAndZeroFeet_WhenBothSame_ShouldRerturnEqual()
    {
        int feet = 0;
        int feet1 = 0;
        boolean totalLength = quantityMeasurement.calLength(feet,feet1);
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
        int feet = 5;
        int feet1 = 5;
        boolean result = quantityMeasurement.calLength(feet,feet1);
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenValueForEquality_WhenBothSameInches_ThnenShouldReturnTrue()
    {
        int inch = 10;
        int inch1 = 10;
        boolean result = quantityMeasurement.calLength(inch,inch1);
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenFtNYard_WhenProper_ShouldReturnYardValue()
    {
        int feet = 3;
        int yard = 1;
        int result = quantityMeasurement.ftToYardConcersion(feet,yard);
        Assert.assertEquals(3,result);
    }

}
