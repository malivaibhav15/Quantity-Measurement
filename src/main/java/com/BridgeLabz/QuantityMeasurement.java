package com.BridgeLabz;

public class QuantityMeasurement
{
    public double calculateLength(int foot, double inches) {
        double totalLength = foot*inches;
        return totalLength;
    }
    public boolean calLength(int foot , int foot1)
    {
        return foot == foot1;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return true;
        if (this.getClass() == obj.getClass())
            return true;
        if (obj == this)
            return true;
        return super.equals(obj);
    }
}
