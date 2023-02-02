import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Game {

	static Logger log = LogManager.getLogger(Game.class.getName());
	
	public static void main(String[] args) throws IOException {
		try {
		log.debug("hello World");
		}
		catch(Exception e) {
			log.error(e);
		}
		
		System.out.println("Game started");
		
		TextController textController = new TextController();
		
		initGame(textController.flagController);
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String nameString = reader.readLine().toLowerCase();
		
		if (!nameString.equals("end") ){
			textController.InputText(nameString);
		} 
		
		while(!nameString.equals("end") ){
			nameString = reader.readLine();
			textController.InputText(nameString);
		}
		
		System.out.println("-- GAME ENDED --");
	}
	
	public static void initGame(FlagController txt) {
		FancyMirror fMirror = new FancyMirror();
		fMirror.initObject(txt);
		
	}

}
