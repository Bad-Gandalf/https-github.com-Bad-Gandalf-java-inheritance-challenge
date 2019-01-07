package com.patdoc;

public class Main {

    public static void main(String[] args) {
	Printer printer = new Printer(100, 0, true);
        System.out.println(printer.getNumPagesPrinted());
        System.out.println(printer.getTonerLevel());
        System.out.println(printer.isDuplex());

        printer.print(50);
        System.out.println(printer.getNumPagesPrinted());
        System.out.println(printer.getTonerLevel());
        printer.addToner(18);
        System.out.println(printer.getTonerLevel());
        printer.print(29);
        System.out.println(printer.getTonerLevel());
        System.out.println(printer.isDuplex());

    }
}
