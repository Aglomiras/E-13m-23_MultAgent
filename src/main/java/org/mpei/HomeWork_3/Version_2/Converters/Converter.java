package org.mpei.HomeWork_3.Version_2.Converters;

public interface Converter {
    double convertToRub(double ue);
    double convertToCurency(double rub);
    Type getType();

}
