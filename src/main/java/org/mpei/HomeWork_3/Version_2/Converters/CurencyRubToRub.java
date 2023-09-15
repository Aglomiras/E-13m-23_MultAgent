package org.mpei.HomeWork_3.Version_2.Converters;

public class CurencyRubToRub implements Converter {
    private double meaning = 1;
    @Override
    public double convertToRub(double ue) {
        return ue * meaning;
    }

    @Override
    public double convertToCurency(double rub) {
        return rub / meaning;
    }

    @Override
    public Type getType() {
        return Type.Rub;
    }
}
