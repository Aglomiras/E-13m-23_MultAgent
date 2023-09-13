package org.mpei.HomeWork_3.Version_1;

import org.mpei.HomeWork_3.Version_1.Converters.CurencyDollarToRub;
import org.mpei.HomeWork_3.Version_1.Converters.CurencyYenToRub;
import org.mpei.HomeWork_3.Version_1.Converters.CurencyYuanToRub;
import org.mpei.HomeWork_3.Version_1.Converters.Type;

public class Exchanger {
    CurencyDollarToRub curencyDollarToRub = new CurencyDollarToRub();
    CurencyYenToRub curencyYenToRub = new CurencyYenToRub();
    CurencyYuanToRub curencyYuanToRub = new CurencyYuanToRub();
    public void convert(double goldMy, Type inputMy, Type outputMy) {
        double support;
        if (outputMy == Type.Rub) {
            if (inputMy == Type.Dollar) {
                System.out.println(curencyDollarToRub.convertToRub(goldMy));
            } else if (inputMy == Type.Yen) {
                System.out.println(curencyYenToRub.convertToRub(goldMy));
            } else if (inputMy == Type.Yuan){
                System.out.println(curencyYuanToRub.convertToRub(goldMy));
            } else {
                System.out.println(goldMy);
            }
        } else if (outputMy == Type.Dollar){
            if (inputMy == Type.Dollar) {
                System.out.println(goldMy);
            } else if (inputMy == Type.Yen){
                support = curencyYenToRub.convertToRub(goldMy);
                System.out.println(curencyDollarToRub.convertToCurency(support));
            } else if (inputMy == Type.Yuan) {
                support = curencyYuanToRub.convertToRub(goldMy);
                System.out.println(curencyDollarToRub.convertToCurency(support));
            } else {
                System.out.println(curencyDollarToRub.convertToCurency(goldMy));
            }
        } else if (outputMy == Type.Yen) {
            if (inputMy == Type.Dollar) {
                support = curencyDollarToRub.convertToRub(goldMy);
                System.out.println(curencyYenToRub.convertToCurency(support));
            } else if (inputMy == Type.Yen) {
                System.out.println(goldMy);
            } else if (inputMy == Type.Yuan) {
                support = curencyYuanToRub.convertToRub(goldMy);
                System.out.println(curencyYenToRub.convertToCurency(support));
            } else {
                System.out.println(curencyYenToRub.convertToCurency(goldMy));
            }
        } else {
            if (inputMy == Type.Dollar) {
                support = curencyDollarToRub.convertToRub(goldMy);
                System.out.println(curencyYuanToRub.convertToCurency(support));
            } else if (inputMy == Type.Yen) {
                support = curencyYenToRub.convertToRub(goldMy);
                System.out.println(curencyYuanToRub.convertToCurency(support));
            } else if (inputMy == Type.Yuan) {
                System.out.println(goldMy);
            } else {
                System.out.println(curencyYuanToRub.convertToRub(goldMy));
            }
        }
    }
}
