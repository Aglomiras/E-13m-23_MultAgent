package org.mpei.HomeWork_3.Convercers;

import static org.mpei.HomeWork_3.Convercers.Type.Yen;

public class CurencyYen_Rub implements Converter {
    private Type titl = Yen;
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
        return titl;
    }
}
