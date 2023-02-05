import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Game {

	static Logger log = LogManager.getLogger(Game.class.getName());
	
	public static void main(String[] args) throws IOException {
		/*
		try {
		log.debug("hello World");
		}
		catch(Exception e) {
			log.error(e);
		}
		*/
		
		InitializeGame();
		
		//ASCII title for some extra 80s look
		System.out.println("  ___  __    _____  _    _  _  _    ___  __  __  ____  ____  ____ ");
		System.out.println(" / __)(  )  (  _  )( |/|/ )( |( )  / __)(  )(  )(  _ )( ___)(  _ )");
		System.out.println("( (__  )(__  )(_)(  )    (  )  (   }__ ) )(__)(  )___/ )__)  )   /");
		System.out.println(" {___)(____)(_____)(__/{__)(_){ )  (___/(______)(__)  (____)(_))_)");
		System.out.println(" ____  __  __  _  _    _   _  _____  __  __  ___  ____ ");
		System.out.println("( ___)(  )(  )( |( )  ( )_( )(  _  )(  )(  )/ __)( ___)");
		System.out.println(" )__)  )(__)(  )  (    ) _ (  )(_)(  )(__)(  }_ ) )__) ");
		System.out.println("(__)  (______)(_){_)  (_) (_)(_____)(______)(___/(____)");
		System.out.println("   __    ____   _  _  ____  _  _  ____  __  __  ____  ____  ___"); 
		System.out.println("  /__|  (  _ | ( {} )( ___)( |( )(_  _)(  )(  )(  _ }( ___)/ __)");
		System.out.println(" /(__)]  )(_) ) {  /  )__)  )  (   )(   )(__)(  )   / )__)  }_ )");
		System.out.println("(__)(__)(____/   {/  (____)(_){_) (__) (______)(_))_)(____)(___/");
		
		System.out.println("Commands: \rWalk \rMove \rGo \rGrab \rItems \rWalk Through \rExamine \r ");
		
		TextController textController = new TextController();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String nameString = reader.readLine().toLowerCase();
		
		if (!nameString.equals("end") ){
			textController.InputText(nameString);
		} 
		
		while(!nameString.equals("end") ){
			nameString = reader.readLine().toLowerCase();
			textController.InputText(nameString);
		}
		
		System.out.println("-- GAME ENDED --");
	}
	
	//ALL GAME INIT STUFF HAPPENS HERE
	private static void InitializeGame() {
		RoomController rm = RoomController.GetInstance();
		rm.ChangeRoom("dressingRoom");
	}
	
}
