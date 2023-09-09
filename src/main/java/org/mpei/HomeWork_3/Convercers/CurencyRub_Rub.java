package org.mpei.HomeWork_3.Convercers;

import static org.mpei.HomeWork_3.Convercers.Type.Rub;

public class CurencyRub_Rub implements Converter {
    private Type titl = Rub;
    @Override
    public double convertToRub(double ue) {
        return ue;
    }

    @Override
    public double convertToCurency(double rub) {
        return rub;
    }

    @Override
    public Type getTitl() {
        return titl;
    }
}
