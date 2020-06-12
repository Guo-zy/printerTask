package test;

import model.blackAndWhite_Printer;
import model.color_Printer;
import model.printer;

public class testPrinter {
    public static void main(String[] args) {
        printer color_Printer = new color_Printer();
        printer blackAndWhite_Printer = new blackAndWhite_Printer();
        color_Printer.printing();
        blackAndWhite_Printer.printing();
    }
}
