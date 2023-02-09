import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.PublicKey;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Game {

	static Logger log = LogManager.getLogger(Game.class.getName());
	
	private static Intro intro = new Intro();
	
	public static void main(String[] args) throws IOException {
		/*
		try {
		log.debug("hello World");
		}
		catch(Exception e) {
			log.error(e);
		}
		*/
		
		intro.showTitle();
		
		intro.introParagraph();
		
		InitializeGame();
	
		System.out.println("Type Help or Commands for a list of commands");
		
		TextController textController = new TextController();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String nameString = reader.readLine().toLowerCase();
		
		if (!nameString.equals("quit") ){
			textController.InputText(nameString);
		} 
		
		while(!nameString.equals("quit") ){
			nameString = reader.readLine().toLowerCase();
			textController.InputText(nameString);
		}
		
		System.out.println("-- GAME ENDED --");
	}
	
	//ALL GAME INIT STUFF HAPPENS HERE
	private static void InitializeGame() {
		RoomController rm = RoomController.GetInstance();
		rm.RoomControllerTags();
		rm.ChangeRoom("dressingRoom");
	}
	
}
