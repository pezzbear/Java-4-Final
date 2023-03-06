import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Intro {
	
	//Chapter 4 #2 - Strings to hold welcome message to utilize Supplier functional interface
	private static String welcomeMessage = "Welcome to Clown Super Fun House Adventures! Your date of game access is: ";
	
	//ASCII title for some extra 80s look
	public void showTitle() { 
		System.out.println("\r\n"
				+ " ▄████▄   ██▓     ▒█████   █     █░███▄    █      ██████  █    ██  ██▓███  ▓█████  ██▀███  \r\n"
				+ "▒██▀ ▀█  ▓██▒    ▒██▒  ██▒▓█░ █ ░█░██ ▀█   █    ▒██    ▒  ██  ▓██▒▓██░  ██▒▓█   ▀ ▓██ ▒ ██▒\r\n"
				+ "▒▓█    ▄ ▒██░    ▒██░  ██▒▒█░ █ ░█▓██  ▀█ ██▒   ░ ▓██▄   ▓██  ▒██░▓██░ ██▓▒▒███   ▓██ ░▄█ ▒\r\n"
				+ "▒▓▓▄ ▄██▒▒██░    ▒██   ██░░█░ █ ░█▓██▒  ▐▌██▒     ▒   ██▒▓▓█  ░██░▒██▄█▓▒ ▒▒▓█  ▄ ▒██▀▀█▄  \r\n"
				+ "▒ ▓███▀ ░░██████▒░ ████▓▒░░░██▒██▓▒██░   ▓██░   ▒██████▒▒▒▒█████▓ ▒██▒ ░  ░░▒████▒░██▓ ▒██▒\r\n"
				+ "░ ░▒ ▒  ░░ ▒░▓  ░░ ▒░▒░▒░ ░ ▓░▒ ▒ ░ ▒░   ▒ ▒    ▒ ▒▓▒ ▒ ░░▒▓▒ ▒ ▒ ▒▓▒░ ░  ░░░ ▒░ ░░ ▒▓ ░▒▓░\r\n"
				+ "  ░  ▒   ░ ░ ▒  ░  ░ ▒ ▒░   ▒ ░ ░ ░ ░░   ░ ▒░   ░ ░▒  ░ ░░░▒░ ░ ░ ░▒ ░      ░ ░  ░  ░▒ ░ ▒░\r\n"
				+ "░          ░ ░   ░ ░ ░ ▒    ░   ░    ░   ░ ░    ░  ░  ░   ░░░ ░ ░ ░░          ░     ░░   ░ \r\n"
				+ "░ ░          ░  ░    ░ ░      ░            ░          ░     ░                 ░  ░   ░     \r\n"
				+ "░                                                                                          \r\n"
				+ "  █████▒█    ██  ███▄    █     ██░ ██  ▒█████   █    ██   ██████ ▓█████                    \r\n"
				+ "▓██   ▒ ██  ▓██▒ ██ ▀█   █    ▓██░ ██▒▒██▒  ██▒ ██  ▓██▒▒██    ▒ ▓█   ▀                    \r\n"
				+ "▒████ ░▓██  ▒██░▓██  ▀█ ██▒   ▒██▀▀██░▒██░  ██▒▓██  ▒██░░ ▓██▄   ▒███                      \r\n"
				+ "░▓█▒  ░▓▓█  ░██░▓██▒  ▐▌██▒   ░▓█ ░██ ▒██   ██░▓▓█  ░██░  ▒   ██▒▒▓█  ▄                    \r\n"
				+ "░▒█░   ▒▒█████▓ ▒██░   ▓██░   ░▓█▒░██▓░ ████▓▒░▒▒█████▓ ▒██████▒▒░▒████▒                   \r\n"
				+ " ▒ ░   ░▒▓▒ ▒ ▒ ░ ▒░   ▒ ▒     ▒ ░░▒░▒░ ▒░▒░▒░ ░▒▓▒ ▒ ▒ ▒ ▒▓▒ ▒ ░░░ ▒░ ░                   \r\n"
				+ " ░     ░░▒░ ░ ░ ░ ░░   ░ ▒░    ▒ ░▒░ ░  ░ ▒ ▒░ ░░▒░ ░ ░ ░ ░▒  ░ ░ ░ ░  ░                   \r\n"
				+ " ░ ░    ░░░ ░ ░    ░   ░ ░     ░  ░░ ░░ ░ ░ ▒   ░░░ ░ ░ ░  ░  ░     ░                      \r\n"
				+ "          ░              ░     ░  ░  ░    ░ ░     ░           ░     ░  ░                   \r\n"
				+ "                                                                                           \r\n"
				+ " ▄▄▄      ▓█████▄  ██▒   █▓▓█████  ███▄    █ ▄▄▄█████▓ █    ██  ██▀███  ▓█████   ██████    \r\n"
				+ "▒████▄    ▒██▀ ██▌▓██░   █▒▓█   ▀  ██ ▀█   █ ▓  ██▒ ▓▒ ██  ▓██▒▓██ ▒ ██▒▓█   ▀ ▒██    ▒    \r\n"
				+ "▒██  ▀█▄  ░██   █▌ ▓██  █▒░▒███   ▓██  ▀█ ██▒▒ ▓██░ ▒░▓██  ▒██░▓██ ░▄█ ▒▒███   ░ ▓██▄      \r\n"
				+ "░██▄▄▄▄██ ░▓█▄   ▌  ▒██ █░░▒▓█  ▄ ▓██▒  ▐▌██▒░ ▓██▓ ░ ▓▓█  ░██░▒██▀▀█▄  ▒▓█  ▄   ▒   ██▒   \r\n"
				+ " ▓█   ▓██▒░▒████▓    ▒▀█░  ░▒████▒▒██░   ▓██░  ▒██▒ ░ ▒▒█████▓ ░██▓ ▒██▒░▒████▒▒██████▒▒   \r\n"
				+ " ▒▒   ▓▒█░ ▒▒▓  ▒    ░ ▐░  ░░ ▒░ ░░ ▒░   ▒ ▒   ▒ ░░   ░▒▓▒ ▒ ▒ ░ ▒▓ ░▒▓░░░ ▒░ ░▒ ▒▓▒ ▒ ░   \r\n"
				+ "  ▒   ▒▒ ░ ░ ▒  ▒    ░ ░░   ░ ░  ░░ ░░   ░ ▒░    ░    ░░▒░ ░ ░   ░▒ ░ ▒░ ░ ░  ░░ ░▒  ░ ░   \r\n"
				+ "  ░   ▒    ░ ░  ░      ░░     ░      ░   ░ ░   ░       ░░░ ░ ░   ░░   ░    ░   ░  ░  ░     \r\n"
				+ "      ░  ░   ░          ░     ░  ░         ░             ░        ░        ░  ░      ░     \r\n"
			+ "           ░           ░                                                                   \r\n"
+ "");
		
	}
			
	public void introParagraph() {

		System.out.println("You are trapped and the only way out is "
				+ "to trick the House into thinking you too are a clown.");
		System.out.println("Collect the clown items to attempt your trickery -- "
				+ "some items may be easier to retrieve than others.");
		
		System.out.println();
	}
	
	//Chapter 4 #2 - Implement method for supplier functional interface example
	public void supplierExample() {
		//Chapter 4 #2 - Supplier Function to return the greeting message
		Supplier<String> greeting = () -> welcomeMessage;
		
		//Chapter 4 #2 - Supplier Function to return the date now
		Supplier<LocalDate> dateToday = LocalDate::now;
		
		//Set date to date now
		LocalDate date = dateToday.get();
		
		//Print the greeting message
		System.out.println(greeting.get());
		
		//Print the date now
		System.out.println(date);
		System.out.println();
	}
	
	
	//Chapter 4 #2 - Implement method for consumer functional interface example
	public void consumerExample() {
		
		//Consumer to display item list
        Consumer<List<String> >
        itemList = list -> list.stream().forEach(i -> System.out.print(i + " "));
        
        //Create list and add items to the list
        List<String> list = new ArrayList<String>();
        list.add("Mirror");
        list.add("Makeup");
        list.add("Outfit");
        list.add("Nose");
        
        //Display message 
        System.out.println("Your list of items to find is: ");
        
        //Display list of inventory from Consumer
        itemList.accept(list);
        
        //Display blank line
        System.out.println();
        System.out.println();
        
        //Statement to begin game in this room
        System.out.println("You awake in the dressing room -- inside is a fancy mirror.");
	}
}
