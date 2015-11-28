public class Spieler{
    private String name;
    private Raum position;


    // constructor without paramters
    public Spieler(){
    	this.name = "NoName";
    	this.position = null;
    }

    public Spieler(String name){
        this.name = name;
        this.position = null;
    }

    // constructor defining the player's name and starting point
    public Spieler(String name, Raum position){
        this.name = name;
        this.position = position;
    }
    // change the players name
    public void setName(String name){
        this.name = name;
    }
    // get the player's name
    public String getName(){
        return this.name;
    }

    public Raum getRaum(){
        return position;
    }

}
