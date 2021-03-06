import java.util.Scanner;

/**
 * @author Felix Bello, Gilles Brunner
 * @version 0.1
 */

public class Hunter {


	public static void main(String[] args) {
		// Scanner for Reading Console Input
		Scanner sc = new Scanner(System.in);
		String eingabe;

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

		// Raum Eingangshalle Createn
		Raum eingangsHalle = new Raum("eingangshalle");
		eingangsHalle.setAusgang("south", true);

		// create a new player
		Spieler newPlayer = new Spieler("Felix", "draussen");

		// create player with name and starting point
		Spieler playerTwo = new Spieler("Gilles", "draussen");
		
		// Printout the Welcome Message
		Message msg = new Message();
		System.out.println(msg.getWelcomeMessage());
		System.out.println("draussen, wohnZimmer, badeZimmer, schlafZimmer, kueche");
		// Printout the name and Position of the Players
		System.out.println(msg.getActualPositionMessage(newPlayer));
		System.out.println("In welche Richtung willst du dich Bewegen?");
		eingabe = (sc.nextLine());
		
		switch (eingabe){
		case "north":
			newPlayer.setPosition("eingangshalle");
			System.out.print("Du befindest dich jetzt im Raum: " + newPlayer.getPosition() + " was möchtest du nun tun?");
			break;
		case "south":
			System.out.print("Es gibt südlich keinen Ausgang!");
			break;
		case "east":
			System.out.print("Es gibt östlich keinen Ausgang!");
			break;
		case "west":
			System.out.print("Es gibt westlich keinen Ausgang");
			break;
		case "quit":
			System.exit(0);
		default:
			break;
		}
	}

}
