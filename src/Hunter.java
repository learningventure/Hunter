/**
 * @author Felix Bello, Gilles Brunner
 * @version 0.1
 */
public class Hunter {

	static Raum draussen;
	
	public Hunter() {
		// TODO Auto-generated constructor stub
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		draussen = new Raum("draussen");
		draussen.setAusgang("north", true);
	}

}
