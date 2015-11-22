
public class Message {
	
	String welcome;
	
	public Message() {
		this.welcome = "Willkommen zum Spiel Hunter\nEs stehen folgende Räume zur Verfügung";
	}

	public String getWelcomeMessage(){
		return this.welcome;
	}
	
	public String getActualPositionMessage(Spieler name){
		return "Ihre aktuelle Position ist " + name.getPosition();
	}
}
