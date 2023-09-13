package org.mpei.HomeWork_3.Version_2.Converters;

public class CurencyDollarToRub implements Converter {
    @Override
    public double convertToRub(double ue) {
        return ue * 97.92;
    }

    @Override
    public double convertToCurency(double rub) {
        return rub / 97.92;
    }

    @Override
    public Type getType() {
        return Type.Dollar;
    }
}
