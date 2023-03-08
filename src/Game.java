import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.PublicKey;
import java.sql.SQLException;
import java.util.Locale;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
* The Game class initializes the Game for the final text game project.
*
* @author  Emily, Mitchell, Edan, Richard
* @version 1.0
* @since   2023-03-08 
*/
public class Game {

	static Logger log = LogManager.getLogger(Game.class.getName());
	
	//private static DatabaseControls dbControls = new DatabaseControls();
	
	private static Intro intro = new Intro();
	
	public static void main(String[] args) throws IOException, SQLException {
		/*
		try {
		log.debug("hello World");
		}
		catch(Exception e) {
			log.error(e);
		}
		*/
		
		Locale english = new Locale("en", "EN");
		Locale irish = new Locale("ga", "IE");
		
		intro.showTitle();
		
		//Show the supplier example
		intro.supplierExample(english);
		
		intro.supplierExample(irish);
		
		int age = 18;
        assert age < 18 : "Cannot play";
		
		System.out.println("The user's age is at least: " + age);
        System.out.println();
		
		intro.introParagraph();
		
		//Show the consumer example
		intro.consumerExample();
		
		InitializeGame();
		
		//dbControls.GetItem();
	
		System.out.println("Type Help or Commands for a list of commands");
		
		TextController textController = new TextController();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String nameString = reader.readLine().toLowerCase();
		FlagController flagController = FlagController.GetInstance();
		
		if (!nameString.equals("quit") ){
			textController.InputText(nameString);
		} 
		
		while(!nameString.equals("quit") ){
			nameString = reader.readLine().toLowerCase();
			if (!flagController.GetFlag("gameIsWon") ){
				textController.InputText(nameString);
			}
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
