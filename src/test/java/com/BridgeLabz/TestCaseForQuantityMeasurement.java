package com.BridgeLabz;

import org.junit.Assert;
import org.junit.Test;

public class TestCaseForQuantityMeasurement
{
    QuantityMeasurement quantityMeasurement =  new QuantityMeasurement();

    @Test
    public void givenFeetValue_WhenEqual_ReturnTrue() throws QuantityMeasurementException {
        CheckEquals value1 = new CheckEquals(1.0, Unit.FEET);
        CheckEquals value2 = new CheckEquals(1.0, Unit.FEET);
        boolean isEqual = quantityMeasurement.compare(value1, value2);
        Assert.assertEquals(true, isEqual);
    }

    @Test
    public void givenNullValue_WhenNotEqual_ReturnFalse() {
        CheckEquals value1 = new CheckEquals(1.0, Unit.FEET);
        try {
            boolean isEqual = quantityMeasurement.compare(value1, null);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_POINTER_EXCEPTION, e.type);
        }
    }

    @Test
    public void givenSameReferance_WhenEqual_ReturnTrue() throws QuantityMeasurementException {
        CheckEquals value1 = new CheckEquals(1.0, Unit.FEET);
        boolean isEqual = quantityMeasurement.compare(value1, value1);
        Assert.assertEquals(true, isEqual);
    }

    @Test
    public void givenSameType_WhenEqual_ReturnTrue() throws QuantityMeasurementException {
        double feet1 = 1.0;
        double feet2 = 1.0;
        CheckEquals value1 = new CheckEquals(feet1, Unit.FEET);
        CheckEquals value2 = new CheckEquals(feet2, Unit.FEET);
        boolean isEqual = quantityMeasurement.compare(value1, value2);
        Assert.assertEquals(true, isEqual);
    }

    @Test
    public void givenSameFeetValue_WhenEqual_ReturnTrue() throws QuantityMeasurementException {
        CheckEquals value1 = new CheckEquals(12.0, Unit.FEET);
        CheckEquals value2 = new CheckEquals(12.0, Unit.FEET);
        boolean isEqual = quantityMeasurement.compare(value1, value2);
        Assert.assertEquals(true, isEqual);
    }

    @Test
    public void givenNullInInch_WhenNotEqual_ShouldReturnFalse()
    {
        CheckEquals value1 = new CheckEquals(1.0,Unit.INCH);
        try
        {
            boolean isEqual = quantityMeasurement.compare(value1,null);
        }catch (QuantityMeasurementException e)
        {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_POINTER_EXCEPTION, e.type);
        }
    }
}
