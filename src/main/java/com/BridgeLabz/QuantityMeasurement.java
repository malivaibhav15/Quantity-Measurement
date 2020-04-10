package com.BridgeLabz;

public class QuantityMeasurement
{
    public double calculateLength(int foot, double inches) {
        double totalLength = foot*inches;
        return totalLength;
    }
    public boolean calLength(int foot , int inch)
    {
        if (foot == inch)
            return true;
        else
            return false;
    }

}
