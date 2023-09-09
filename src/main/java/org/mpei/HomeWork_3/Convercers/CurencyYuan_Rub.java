package org.mpei.HomeWork_3.Convercers;

import static org.mpei.HomeWork_3.Convercers.Type.Yuan;

public class CurencyYuan_Rub implements Converter {
    private Type titl = Yuan;
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
        return titl;
    }
}
