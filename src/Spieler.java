public class Spieler{
    private String name;
    private String startPunkt;
    
    // empty constructor
    public Spieler(){
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
    }

    // change the players name
    public void setName(String name){
        this.name = name;
    }

    // get the player's name
    public String getName(){
        return this.name;
    }

    // get Position of the player
    public String getPosition(){
		return this.startPunkt;
	}
   
}
