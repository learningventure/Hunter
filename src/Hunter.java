/**
 * @author Felix Bello, Gilles Brunner
 * @version 0.1
 */
public class Hunter {


	public static void main(String[] args) {
		
		// Raum draussen Createn
		Raum draussen = new Raum("draussen");
		draussen.setAusgang("north", true);
		System.out.println(draussen.getAusgang());
		
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
		System.out.println("Der Name des ersten und einzigen Spielers ist: " + newPlayer.getName());
	}

}
