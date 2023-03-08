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

	//Get the LogManager
	static Logger log = LogManager.getLogger(Game.class.getName());
	
	//Create a new instance of the Intro Class: Brings to console starting credits and images.
	private static Intro intro = new Intro();
	
	  /**
	   * Main method to start the game 
	   */
	public static void main(String[] args) throws IOException, SQLException {
		
		//Chapter 5 #3 - String localization
		Locale english = new Locale("en", "EN");
		Locale irish = new Locale("ga", "IE");
		
		//Show the intro title
		intro.showTitle();
		
		//Show the supplier example
		intro.supplierExample(english);
		
		intro.supplierExample(irish);
		
		//Chapter 6 #5 - use of an assertion to say user can't play under 18 years old
		int age = 18;
        assert age < 18 : "Cannot play";
		
        //Print user's age
		System.out.println("The user's age is at least: " + age);
        System.out.println();
		
        //Print intro paragraph
		intro.introParagraph();
		
		//Show the consumer example
		intro.consumerExample();
		
		//Initialize game
		InitializeGame();
		
		//Print helper command list
		System.out.println("Type Help or Commands for a list of commands");
		
		//Create an instance of the TextController
		TextController textController = new TextController();
		
		//Allow for user input and create instance of the flagController class
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String nameString = reader.readLine().toLowerCase();
		FlagController flagController = FlagController.GetInstance();
		
		//If user quits game allow user to quit
		if (!nameString.equals("quit") ){
			textController.InputText(nameString);
		} 
		while(!nameString.equals("quit") ){
			
			nameString = reader.readLine().toLowerCase();
			if (!flagController.GetFlag("gameIsWon") ){
				textController.InputText(nameString);
			}
		}
		
		//Print that game ended
		System.out.println("-- GAME ENDED --");
	}
	
	  /**
	   * Initializes the game
	   * Gets the staring room which is the dressing room
	   */
	private static void InitializeGame() {
		RoomController rm = RoomController.GetInstance();
		rm.RoomControllerTags();
		rm.ChangeRoom("dressingRoom");
	}
	
}
