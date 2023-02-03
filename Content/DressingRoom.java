
public class DressingRoom extends Room{

	@Override
	public void InitRoom() {
		title = "Dressing Room";
		description = "A room that looks like a regular dressing room.";
		objectsSouth = new Object[1];
		objectsSouth[0] = new FancyMirror();
	}

}
