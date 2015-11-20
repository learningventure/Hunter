public class Spieler{
    private String name;
    private Raum position;

    // empty constructor
    public Spieler(){
        //
    }
    // constructor defining the player's name and starting point
    public Spieler(String name, Raum startPunkt){
        this.name = name;
        this.position = startPunkt;
    }
    // change the players name
    public void setName(String name){
        this.name = name;
    }
    // get the player's name
    public String getName(){
        return this.name;
    }

    // show the players position
    public Raum getPosition(){
		return startPunkt;
	}
}
