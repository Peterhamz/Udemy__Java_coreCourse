package UdemyJava.Vehicle;

public class Printer {

    public static void main(String[] args) {
        Printer printer = new Printer(50, false);

        System.out.println("initial page count = " + printer.getPagePrinted());

        int tonerLevel1 = printer.tonerLevel;
        System.out.println("we have a particular level of toner remaining which is = " + tonerLevel1);

        int pagesPrinted = printer.printPages(7);
        System.out.println("pages printed was " + pagesPrinted +  " new total print count for printer = " + printer.getPagePrinted());
    }
    private int tonerLevel;
    private int pagePrinted;
    private final boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
       if(tonerLevel >= -1 && tonerLevel <= 100) {
           this.tonerLevel = tonerLevel;
       }else {
           this.tonerLevel = -1;
       }

        this.duplex = duplex;
        this.pagePrinted = 0;
    }

    public int addToner(int tonerAmount){
        if (tonerAmount > 0 && tonerAmount <=100){
            if(this.tonerLevel + tonerAmount > 100){
                return  -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        }else{
            return -1;
        }
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if(this.duplex){
            pagesToPrint = (pages/2) + (pages % 2);
            System.out.println("printing in duplex mode!!!!");
        }
        this.pagePrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagePrinted() {
        return pagePrinted;
    }
}
