package org.mpei.HomeWork_3.Version_2.Converters;

public class CurencyYenToRub implements Converter {
    private double meaning = 0.67;
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
        return Type.Yen;
    }
}
