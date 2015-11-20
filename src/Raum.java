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
		this.name = name;
	}

}
