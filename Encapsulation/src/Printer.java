public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmout)
    {
        if(tonerAmout + tonerLevel < 0 || tonerAmout + tonerLevel > 100)
        {
            return -1;
        }
        return tonerLevel + tonerAmout;
    }

    public int printPages(int pages)
    {
        int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;
        pagesPrinted += pages;

        return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
