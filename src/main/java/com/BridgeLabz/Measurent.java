package com.BridgeLabz;

import com.sun.tools.javac.comp.Check;

public class Measurement {

    public boolean compare(CheckEquals value1, Check value2) throws QuantityMeasurementException {
        if (value1 == null || value2 == null)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL_POINTER_EXCEPTION, "Null Object");
        return value1.equals(value2);
    }

}