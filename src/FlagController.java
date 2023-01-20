import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class FlagController {
	static Dictionary items = new Hashtable();
	
	public static void makedictionary() {
		items.put("Sword", "0");
		items.put("Torch", "1");
	}
	public static void changeboolpos(String item)
	{
		String change = (String) items.get(item);
		int value = Integer.parseInt(change) + 1;
		items.put(item, Integer.toString(value));
	}
	public static void changeboolneg(String item) {
		String change = (String) items.get(item);
		int value = Integer.parseInt(change) - 1;
		items.put(item, Integer.toString(value));
	}
	public static boolean getbool(String item) {
		String thing = (String) items.get(item);
		boolean bool;
		if(thing.equals("1"))
		{
			bool = true;
		}
		else
		{
			bool = false;
		}
		return bool;
	}
	public static void listitems() {
		System.out.println("The Items you currently have are:");
		Enumeration enu = items.keys();
		while(enu.hasMoreElements())
		{
			String placeholder = (String) enu.nextElement();
			if((String) items.get(placeholder) == "1") {
				System.out.println(placeholder);
			}
		}
	}
}
