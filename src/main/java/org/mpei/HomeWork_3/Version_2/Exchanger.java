package org.mpei.HomeWork_3.Version_2;

import org.mpei.HomeWork_3.Version_2.Converters.*;

import java.util.Optional;

public class Exchanger {
    private static final CurencyDollarToRub curencyDollarToRub = new CurencyDollarToRub();
    private static final CurencyYenToRub curencyYenToRub = new CurencyYenToRub();
    private static final CurencyYuanToRub curencyYuanToRub = new CurencyYuanToRub();
    private static final CurencyRubToRub curencyRubToRub = new CurencyRubToRub();
    private static final Converter[] converters = new Converter[] {curencyDollarToRub, curencyYenToRub, curencyYuanToRub, curencyRubToRub};
    public void convert(double goldMy, Type inputMy, Type outputMy) {
        double support;
        Converter inputMyConv;
        Converter outputMyConv;

        if (!inputMy.equals(Type.Rub) && !outputMy.equals(Type.Rub)) { //Перевод иностранной валюты в иностранную валюту
            inputMyConv = findConverter(inputMy).get();
            outputMyConv = findConverter(outputMy).get();
            support = outputMyConv.convertToCurency(inputMyConv.convertToRub(goldMy));
        } else if (inputMy.equals(Type.Rub)) { //Перевод русского рубля в иностранную валюту
            outputMyConv = findConverter(outputMy).get();
            support = outputMyConv.convertToCurency(goldMy);
        } else { //Перевод иностранной валюты в русские рубли
            inputMyConv = findConverter(inputMy).get();
            support = inputMyConv.convertToRub(goldMy);
        }
        System.out.println(support);
    }

    public static Optional<Converter> findConverter(Type type) {
        Optional<Converter> supportConvert = Optional.empty();

        for (Converter converter: converters) {
            if (converter.getType().equals(type)) {
                supportConvert = Optional.of(converter);
            }
        }
        return supportConvert;
    }
}
