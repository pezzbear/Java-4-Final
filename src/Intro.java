import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Shows an intro to the game and an introductory paragraph
 * 
 */
public class Intro {

	// Chapter 4 #2 - Strings to hold welcome message to utilize Supplier functional
	// interface
	private static String welcomeMessage = "Welcome to Clown Super Fun House Adventures! Your date of game access is: ";

	/**
	 * Method to show artsy intro message Shows game creators
	 **/
	public void showTitle() {
		// Chapter 1 #7 - Nested Class giving credit to game makers
		Authors author = new Authors();
		Authors.Nested nested = author.new Nested();
		System.out.println(author.names + ": " + nested.nestedNames);

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

	/**
	 * Creates an inro paragraph
	 */
	public void introParagraph() {

		// Print statements to show game theme and object of the game
		System.out.println(
				"You are trapped and the only way out is " + "to trick the House into thinking you too are a clown.");
		System.out.println("Collect the clown items to attempt your trickery -- "
				+ "some items may be easier to retrieve than others.");

		System.out.println();
	}

	/**
	 * Chapter 4 #2 - Implement method for supplier functional interface example
	 * Shows date and date calculations Shows string localization Prints a game
	 * greeting
	 */
	public void supplierExample(Locale local) {

		ResourceBundle rb = ResourceBundle.getBundle("Final", local);

		// Chapter 4 #2 - Supplier Function to return the greeting message
		Supplier<String> greeting = () -> rb.getString("message");

		// Chapter 4 #2 - Supplier Function to return the date now
		Supplier<LocalDateTime> dateToday = LocalDateTime::now;

		// Set date to date now
		LocalDateTime date = dateToday.get();

		// String localization
		Locale ir = new Locale("ga", "IE");

		// Chapter 5 #4 - date calculation
		if (local.equals(ir)) {
			date = date.minusHours(-6);
		}

		// Print the greeting message
		System.out.println(greeting.get());

		// Print the date now
		System.out.println(date);
		System.out.println();
	}

	/**
	 * Chapter 4 #2 - Implement method for consumer functional interface example
	 * Shows list of items to find to become a clown and exit game Prints items and
	 * beginning game statements
	 */

	public void consumerExample() {

		// Consumer to display item list
		Consumer<List<String>> itemList = list -> list.stream().forEach(i -> System.out.print(i + " "));

		// Create list and add items to the list
		List<String> list = new ArrayList<String>();
		list.add("Mirror");
		list.add("Makeup");
		list.add("Outfit");
		list.add("Nose");

		// Display message
		System.out.println("Your list of items to find is: ");

		// Display list of inventory from Consumer
		itemList.accept(list);

		// Display blank line
		System.out.println();
		System.out.println();

		// Statement to begin game in this room
		System.out.println("You awake in the dressing room -- inside is a fancy mirror.");
	}
}
