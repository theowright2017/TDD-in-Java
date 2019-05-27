public class Water_Bottle {

    private int volume;

    public Water_Bottle(int volume) {
        this.volume = volume;
    }

    public int checkVolume(){
        return this.volume;
    }

    public void takeDrink(){
         this.volume = this.volume - 10;
    }

    public void emptyBottle(){
        this.volume = 0;
    }

    public void fillBottle(){
        this.volume += 100;
    }
}
