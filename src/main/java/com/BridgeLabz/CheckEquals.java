package com.BridgeLabz;

public class CheckEquals
{
    private final double value;
    private final Unit unitValue;

    public CheckEquals(double value, Unit unitValue) {
        this.value = value;
        this.unitValue = unitValue;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        CheckEquals that = (CheckEquals) object;
        return Double.compare(that.value, value) == 0;    }
}
