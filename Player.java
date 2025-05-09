public class Player{
    String playerName;
    int life = 40;
    int poisonCounter = 0;
    int floatMana = 0;
    int timesCommanderCast = 0;
    DeckColors deckColor;


    public Player(String name, DeckColors newColor){
        this.playerName = name;
        this.deckColor = newColor;
        this.poisonCounter = 0;
        this.floatMana = 0;
        this.timesCommanderCast = 0;
    }

    public void setName(String newName){
        this.playerName = newName;
    }

    public String getName(){
        return this.playerName;
    }

    public void setDeckColor(DeckColors newColor){
        this.deckColor = newColor;
    }

    public DeckColors getDeckColors(){
        return this.deckColor;
    }

    public void changeLife(int change){
        this.life += change;
    }

    public int getLife(){
        return this.life;
    }

    public void changePoison(int change){
        this.poisonCounter += change;
    }

    public int getPoison(){
        return this.poisonCounter;
    }

    public void changeFloatMana(int change){
        this.floatMana += change;
    }

    public int getFloatMana(){
        return this.floatMana;
    }

    public void changeCommanderCast(int change){
        this.timesCommanderCast += change;
    }

    public int getCommanderCast(){
        return this.timesCommanderCast;
    }

    public String toString(){
        String text = this.playerName + ": " + this.life + ", " + this.deckColor;
        return text;
    }
}
