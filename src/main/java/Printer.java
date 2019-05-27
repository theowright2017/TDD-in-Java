public class Printer {

    private int numberOfSheets;
    private int tonerVolume;

    public Printer(int numberOfSheets, int tonerVolume) {
        this.numberOfSheets = numberOfSheets;
        this.tonerVolume = tonerVolume;
    }

    public int checkSheets() {
        return this.numberOfSheets;
    }

    public int checkToner() {
        return this.tonerVolume;
    }

    public void printThis(int copies, int pages) {
//        this.numberOfSheets >= copies * pages ? this.numberOfSheets -= (copies * pages) : 0;
        if (this.numberOfSheets >= copies * pages && this.tonerVolume >= copies * pages){
            this.numberOfSheets -= (copies*pages);
            this.tonerVolume -= (copies* pages);
        }
    }



}
