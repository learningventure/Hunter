/**
 * @author Felix Bello, Gilles Brunner
 * @version 0.1
 */
public class Hunter {

	public Spieler newGamer;

	public Hunter() {
		// TODO Auto-generated constructor stub
		new Spieler("Felix");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Der Name des ersten und einzigen Spielers ist: " + newGamer);
	}

}
