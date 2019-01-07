package com.patdoc;

public class Printer {
    private double tonerLevel = 100;
    private int pagesPrinted = 0;
    private boolean isDuplex;



    public Printer(double tonerLevel, int numPagesPrinted, boolean isDuplex){

        if (tonerLevel >= 0 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }else{
            this.tonerLevel = -1;
        }
        if (numPagesPrinted >= 0 ){
            this.pagesPrinted = numPagesPrinted;
        }else{
            this.pagesPrinted = -1;
        }
        this.isDuplex = isDuplex;
    }



    public void print(int amountOfPages){
        int pagesToPrint = amountOfPages;


        if (amountOfPages > 0){
            if (this.isDuplex){
                pagesToPrint = (pagesToPrint / 2) + (pagesToPrint % 2);

                this.tonerLevel -= (double) (pagesToPrint);
            }else {
                this.tonerLevel -= (double) (pagesToPrint * 0.5d);
            }
            this.pagesPrinted += pagesToPrint;
        }
        System.out.println("This printer has printed " + getNumPagesPrinted()
                + " pages in total");
    }

    public void addToner(double amountOfToner){
        if (getTonerLevel() + amountOfToner > 100){
            this.tonerLevel = 100;
        }
        if (amountOfToner > 0){
            this.tonerLevel += amountOfToner;
        }
        System.out.println("New Toner Level is " + getTonerLevel() + "%");
    }

    public double getTonerLevel() {
        return tonerLevel;
    }


    public int getNumPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

}
