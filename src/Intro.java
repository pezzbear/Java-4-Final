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
//+ "                         ^5#&@@@@@&#Y^                           	 ▄████▄   ██▓     ▒█████   █     █░███▄    █      ██████  █    ██  ██▓███  ▓█████  ██▀███  \r\n"
//+ "                ~5B#&&#P?B@@@@@@@@@@@@@BJG#&&#BY^                	▒██▀ ▀█  ▓██▒    ▒██▒  ██▒▓█░ █ ░█░██ ▀█   █    ▒██    ▒  ██  ▓██▒▓██░  ██▒▓█   ▀ ▓██ ▒ ██▒\r\n"
//+ "              ?&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&!              	▒▓█    ▄ ▒██░    ▒██░  ██▒▒█░ █ ░█▓██  ▀█ ██▒   ░ ▓██▄   ▓██  ▒██░▓██░ ██▓▒▒███   ▓██ ░▄█ ▒\r\n"
//+ "             P@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@Y             	▒▓▓▄ ▄██▒▒██░    ▒██   ██░░█░ █ ░█▓██▒  ▐▌██▒     ▒   ██▒▓▓█  ░██░▒██▄█▓▒ ▒▒▓█  ▄ ▒██▀▀█▄  \r\n"
//+ "            ^@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@:            	▒ ▓███▀ ░░██████▒░ ████▓▒░░░██▒██▓▒██░   ▓██░   ▒██████▒▒▒▒█████▓ ▒██▒ ░  ░░▒████▒░██▓ ▒██▒\r\n"
//+ "        !P#&@@@@@@@@@@@@@&BPJ!~^^^~!JP#&@@@@@@@@@@@@@&#P~        	░ ░▒ ▒  ░░ ▒░▓  ░░ ▒░▒░▒░ ░ ▓░▒ ▒ ░ ▒░   ▒ ▒    ▒ ▒▓▒ ▒ ░░▒▓▒ ▒ ▒ ▒▓▒░ ░  ░░░ ▒░ ░░ ▒▓ ░▒▓░\r\n"
//+ "      !&@@@@@@@@@@@@@@#J:               ^J#@@@@@@@@@@@@@@&~      	  ░  ▒   ░ ░ ▒  ░  ░ ▒ ▒░   ▒ ░ ░ ░ ░░   ░ ▒░   ░ ░▒  ░ ░░░▒░ ░ ░ ░▒ ░      ░ ░  ░  ░▒ ░ ▒░\r\n"
//+ "     7@@@@@@@@@@@@@&Y.                     :5&@@@@@@@@@@@@@!     	░          ░ ░   ░ ░ ░ ▒    ░   ░    ░   ░ ░    ░  ░  ░   ░░░ ░ ░ ░░          ░     ░░   ░ \r\n"
//+ "     &@@@@@@@@@@@@Y.^!J:                 ^J!^:5@@@@@@@@@@@@&     	░ ░          ░  ░    ░ ░      ░            ░          ░     ░                 ░  ░   ░     \r\n"
//+ "  .?#@@@@@@@@@@@#~~7:  77.             :?~  :!~7#@@@@@@@@@@@B?.  	░                                                                                          \r\n"
//+ " ?@@@@@@@@@@@@@G?!.     .~7^        .~7^      .~YB@@@@@@@@@@@@&7 	  █████▒█    ██  ███▄    █     ██░ ██  ▒█████   █    ██   ██████ ▓█████                    \r\n"
//+ "Y@@@@@@@@@@@@@5?!    ...   :7!     ?!.   ...    77G@@@@@@@@@@@@@?	▓██   ▒ ██  ▓██▒ ██ ▀█   █    ▓██░ ██▒▒██▒  ██▒ ██  ▓██▒▒██    ▒ ▓█   ▀                    \r\n"
//+ "@@@@@@@@@@@@@# !7   J@@@&G.  ^Y  .5.  :B@@@@7   J^ &@@@@@@@@@@@@&	▒████ ░▓██  ▒██░▓██  ▀█ ██▒   ▒██▀▀██░▒██░  ██▒▓██  ▒██░░ ▓██▄   ▒███                      \r\n"
//+ "&@@@@@@@@@@@@. .G    !P#&#^.^~Y7^??^^.~#&#P!    G  ^@@@@@@@@@@@@&	░▓█▒  ░▓▓█  ░██░▓██▒  ▐▌██▒   ░▓█ ░██ ▒██   ██░▓▓█  ░██░  ▒   ██▒▒▓█  ▄                    \r\n"
//+ "~@@@@@@@@@@@P   77.      :7~.       .~7.      .J^   B@@@@@@@@@@&^	░▒█░   ▒▒█████▓ ▒██░   ▓██░   ░▓█▒░██▓░ ████▓▒░▒▒█████▓ ▒██████▒▒░▒████▒                   \r\n"
//+ " :@@@@@@@@@@~    .^!~~^^?7             ??^~~~~^     !@@@@@@@@@&. 	 ▒ ░   ░▒▓▒ ▒ ▒ ░ ▒░   ▒ ▒     ▒ ░░▒░▒░ ▒░▒░▒░ ░▒▓▒ ▒ ▒ ▒ ▒▓▒ ▒ ░░░ ▒░ ░                   \r\n"
//+ " .@@@@@@@@@@.          ~5               P:          :@@@@@@@@@&  	 ░     ░░▒░ ░ ░ ░ ░░   ░ ▒░    ▒ ░▒░ ░  ░ ▒ ▒░ ░░▒░ ░ ░ ░ ░▒  ░ ░ ░ ░  ░                   \r\n"
//+ "  &@@@@@@@@@.          7~               7!          .@@@@@@@@@&  	 ░ ░    ░░░ ░ ░    ░   ░ ░     ░  ░░ ░░ ░ ░ ▒   ░░░ ░ ░ ░  ░  ░     ░                      \r\n"
//+ "  ^@@@@@@@@@.          :5               P.          :@@@@@@@@&:  	          ░              ░     ░  ░  ░    ░ ░     ░           ░     ░  ░                   \r\n"
//+ "   .G&@@@@@@~           ~J            .J^           ?@@@@@@&P.   	                                                                                           \r\n"
//+ "     .~YPGGGP            :J7:      .^?J:            GGGGPJ~.     	 ▄▄▄      ▓█████▄  ██▒   █▓▓█████  ███▄    █ ▄▄▄█████▓ █    ██  ██▀███  ▓█████   ██████    \r\n"
//+ "            J^   :J~~~?B~^?&7~~!G~~~?&!:!#!^~^Y:   !?            	▒████▄    ▒██▀ ██▌▓██░   █▒▓█   ▀  ██ ▀█   █ ▓  ██▒ ▓▒ ██  ▓██▒▓██ ▒ ██▒▓█   ▀ ▒██    ▒    \r\n"
//+ "             P   ^P    ~J: YP: ~@^ :GJ ^Y^   .G.  .P             	▒██  ▀█▄  ░██   █▌ ▓██  █▒░▒███   ▓██  ▀█ ██▒▒ ▓██░ ▒░▓██  ▒██░▓██ ░▄█ ▒▒███   ░ ▓██▄      \r\n"
//+ "             .5   .P^   JG?B:!JB^BJ!:BJPY   ^P.  .P.             	░██▄▄▄▄██ ░▓█▄   ▌  ▒██ █░░▒▓█  ▄ ▓██▒  ▐▌██▒░ ▓██▓ ░ ▓▓█  ░██░▒██▀▀█▄  ▒▓█  ▄   ▒   ██▒   \r\n"
//+ "              .5.   Y7  G. ^   ^ :.  :  B  !5   .5.              	 ▓█   ▓██▒░▒████▓    ▒▀█░  ░▒████▒▒██░   ▓██░  ▒██▒ ░ ▒▒█████▓ ░██▓ ▒██▒░▒████▒▒██████▒▒   \r\n"
//+ "                J~   !Y:B               Y!??   !J                	 ▒▒   ▓▒█░ ▒▒▓  ▒    ░ ▐░  ░░ ▒░ ░░ ▒░   ▒ ▒   ▒ ░░   ░▒▓▒ ▒ ▒ ░ ▒▓ ░▒▓░░░ ▒░ ░▒ ▒▓▒ ▒ ░   \r\n"
//+ "                 ^?:  .BY               :&~  ^?^                 	  ▒   ▒▒ ░ ░ ▒  ▒    ░ ░░   ░ ░  ░░ ░░   ░ ▒░    ░    ░░▒░ ░ ░   ░▒ ░ ▒░ ░ ░  ░░ ░▒  ░ ░   \r\n"
//+ "                   ~7^                   . ^7^                   	  ░   ▒    ░ ░  ░      ░░     ░      ░   ░ ░   ░       ░░░ ░ ░   ░░   ░    ░   ░  ░  ░     \r\n"
//+ "                     .!!^.             .^!~.                     	      ░  ░   ░          ░     ░  ░         ░             ░        ░        ░  ░      ░     \r\n"
//+ "                        .^~!!~~~^~~~!!~:.  				  	           ░           ░                                                                   \r\n"
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
