/**
 * @author Felix Bello, Gilles Brunner
 * @version 0.1
 */

public class Hunter {


	public static void main(String[] args) {

		// Raum draussen Createn
		Raum draussen = new Raum("draussen");
		draussen.setAusgang("north", true);

		// Raum Wohnzimmer Createn
		Raum wohnZimmer = new Raum("wohnzimmer");
		wohnZimmer.setAusgang("south", true);

		// Raum Badezimmer Createn
		Raum badeZimmer = new Raum("badezimmer");
		badeZimmer.setAusgang("south", true);

		// Raum Schlafzimmer Createn
		Raum schlafZimmer = new Raum("schlafzimmer");
		schlafZimmer.setAusgang("sout", true);

		// Raum Kueche Createn
		Raum kueche = new Raum("kueche");
		kueche.setAusgang("south", true);

		// create a new player
		Spieler newPlayer = new Spieler();
		// choose player name
		newPlayer.setName("Felix");

		// create player with name and starting point
		Spieler playerTwo = new Spieler("Gilles", "draussen");
		
		// Printout the Welcome Message
		Message welcome = new Message();
		System.out.println(welcome.getWelcomeMessage());
		
		// Printout the name and Position of the Players
		System.out.println("Ihre aktuelle Position ist: " + newPlayer.getPosition());
	}

}
