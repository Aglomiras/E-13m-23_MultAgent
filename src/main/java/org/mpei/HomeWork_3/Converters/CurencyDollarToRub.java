package org.mpei.HomeWork_3.Converters;

import static org.mpei.HomeWork_3.Converters.Type.Dollar;

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
    public Type getTitl() {
        return Type.Dollar;
    }
}
