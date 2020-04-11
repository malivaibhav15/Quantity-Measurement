package com.BridgeLabz;

public class QuantityMeasurement
{
    public double calculateLength(int feet, double inches) {
        double totalLength = feet*inches;
        return totalLength;
    }
    public boolean calLength(int feet , int feet1)
    {
        return feet == feet1;
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


    public int ftToYardConcersion(int feet, int yard) {
        return feet*yard;
    }
}
