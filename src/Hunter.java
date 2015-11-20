/**
 * @author Felix Bello, Gilles Brunner
 * @version 0.1
 */
public class Hunter {


	public static void main(String[] args) {
		Raum draussen = new Raum("draussen");
		draussen.setAusgang("north", true);
		System.out.println(draussen.getAusgang());

		// create a new player
		Spieler newPlayer = new Spieler();
		// choose player name
		newPlayer.setName("Felix");
		System.out.println("Der Name des ersten und einzigen Spielers ist: " + newPlayer.getName());
	}

}
