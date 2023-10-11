package org.mpei.ClassWork_9;

import java.util.ArrayList;
import java.util.List;

public class PrinterHelper {

    private List<Printer> printerList = new ArrayList<>();

    public PrinterHelper() {
        try {
            printerList = new BeanAnnotationPostProcessor().findBeans();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public PrinterHelper(List<Printer> printerList) {
        this.printerList = printerList;
    }

    public void printAll(String s) {
        for (Printer printer : printerList) {
            printer.print(s);
        }
    }
}
