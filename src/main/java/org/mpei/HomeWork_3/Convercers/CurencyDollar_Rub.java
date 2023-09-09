package org.mpei.HomeWork_3.Convercers;

import static org.mpei.HomeWork_3.Convercers.Type.Dollar;

public class CurencyDollar_Rub implements Converter {
    private Type titl = Dollar;
    @Override
    public double convertToRub(double ue) {
        return ue * 97.92;
    }

    @Override
    public double convertToCurency(double rub) {
        return rub / 97.92;
    }

    @Override
    public Type getTitl() {
        return titl;
    }
}
