public class Spieler{
    private String name;
<<<<<<< HEAD
    private Raum position;
=======
    private String startPunkt;
>>>>>>> c36dec58c3b3d7de9ca7266c1adac1b64a9eff29

    // empty constructor
    public Spieler(){
<<<<<<< HEAD
        //
=======
    	this.name = "NoName";
    	this.startPunkt = null;
    }
    
    public Spieler(String name){
        this.name = name;
        this.startPunkt = "draussen";
    }
    
    public Spieler(String name, String startPunkt){
    	this.name = name;
    	this.startPunkt = startPunkt;
>>>>>>> c36dec58c3b3d7de9ca7266c1adac1b64a9eff29
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
