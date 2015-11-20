/*
 * @author Felix Bello
 * @version 0.1
 */
public class Raum {
	
	// Variable definition
	private String name;
	private boolean ausNord;
	private boolean ausSued;
	private boolean ausWest;
	private boolean ausOst;
	
	// Constructor
	public Raum(String name) {
	}
	
	// Setter Methods
	public void setAusgang(String name, boolean status){
		switch (name){
		case "north":
			if (status){
				this.ausNord = true;
			}
		case "south":
			if (status){
				this.ausSued = true;
			}
		case "west":
			if (status){
				this.ausWest = true;
			}
		case "east":
			if (status){
				this.ausWest = true;
			}
		}
		
	}
	
	// Getter Methods
	public String getAusgang(){
		if (this.ausNord ){
			return "north";
		} else if (this.ausSued){
			return "south";
		} else if (this.ausWest ){
			return "west";
		} else if (this.ausOst){
			return "east";
		} else {
			return "Keine Ausgaenge gefunden";
		}
	}

}
