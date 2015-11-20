public class Spieler{
    private String name;
    private Raum startPunkt;

    public Spieler(){
        name = "NoName";
        startPunkt = null;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

}
