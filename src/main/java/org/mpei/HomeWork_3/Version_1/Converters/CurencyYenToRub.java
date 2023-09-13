package org.mpei.HomeWork_3.Version_1.Converters;

public class CurencyYenToRub implements Converter {
    @Override
    public double convertToRub(double ue) {
        return ue * 0.67;
    }

    @Override
    public double convertToCurency(double rub) {
        return rub / 0.67;
    }

    @Override
    public Type getTitl() {
        return Type.Yen;
    }
}
