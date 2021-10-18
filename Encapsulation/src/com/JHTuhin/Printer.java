package com.JHTuhin;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted=0;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel>=0 && tonerLevel<=100)
        this.tonerLevel = tonerLevel;
        else
            this.tonerLevel=-1;
        this.duplex = duplex;
    }
    public int addToner(int tonerAmount){
        if(tonerAmount>0 && tonerAmount<100){
            if((tonerAmount+tonerLevel<=100)){
                tonerLevel+=tonerAmount;
                return tonerLevel;
            }

            else
                return -1;
        }
        return -1;
    }
    public int printPages(int pages){
        int pagesToPrint=pages;
        if(duplex){
            System.out.println("Printing in duplex mode");
            if(pagesToPrint%2==0)
                pagesToPrint=pagesToPrint/2;
            else
                pagesToPrint=(pagesToPrint/2)+1;
            pagesPrinted=pagesPrinted+pagesToPrint;
        }
        return pagesToPrint;
    }
    public int getPagesPrinted(){
        return pagesPrinted;
    }
}
