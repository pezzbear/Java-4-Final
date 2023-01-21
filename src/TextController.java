/*
 * 
 * Defines the TextController that is used to control the text that the player is inputting and the text that will be shown to the player in response.
 * 
 */
public class TextController {
	
	public void InputText(String inputString) {
		String inputArr[] = inputString.split(" ", 2);
		
		String verb = inputArr[0];
		String noun = inputString.substring(inputString.indexOf("the") + 4, inputString.length());
		
		System.out.println(verb);
		
		System.out.println(noun);
		
		
	}
	
}
