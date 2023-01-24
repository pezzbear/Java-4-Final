import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {

	public static void main(String[] args) throws IOException {
		System.out.println("Game started");
		
		TextController textController = new TextController();
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String nameString = reader.readLine();
		
		textController.InputText(nameString);
		
		while(!nameString.equals("END") ){
			nameString = reader.readLine();
			textController.InputText(nameString);
		}
		
		System.out.println("-- GAME ENDED --");
	}

}
