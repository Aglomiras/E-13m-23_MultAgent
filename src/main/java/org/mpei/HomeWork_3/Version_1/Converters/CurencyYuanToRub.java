package org.mpei.HomeWork_3.Version_1.Converters;

public class CurencyYuanToRub implements Converter {
    @Override
    public double convertToRub(double ue) {
        return ue * 13.31;
    }

    @Override
    public double convertToCurency(double rub) {
        return rub / 13.31;
    }

    @Override
    public Type getTitl() {
        return Type.Yuan;
    }
}
