public class Spieler{
    private String name;
    private String startPunkt;

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

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

}
