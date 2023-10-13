package org.mpei.ClassWork_9;

public class Main {
    public static void main(String[] args) {
       PrinterHelper pr = new PrinterHelper();
       pr.printAll("Hello");

       StdErrorPrinter stdErrorPrinter = new StdErrorPrinter();
       StdOutPrinter stdOutPrinter = new StdOutPrinter();

       stdErrorPrinter.print("___");
       stdOutPrinter.print("___");
    }
}
