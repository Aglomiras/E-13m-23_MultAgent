package org.mpei.HomeWork_3.Version_2.Converters;

public class CurencyRubToRub implements Converter {
    @Override
    public double convertToRub(double ue) {
        return ue * 1;
    }

    @Override
    public double convertToCurency(double rub) {
        return rub / 1;
    }

    @Override
    public Type getType() {
        return Type.Rub;
    }
}
