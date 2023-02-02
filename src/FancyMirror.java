
public class FancyMirror extends Object {
	
	
	@Override
	public void initObject(FlagController flags) {
		title = "Mirror";
		description = "Its a fancy looking mirror.";
		canPickup = false;
		canWalkThrough = false;
		this.flags = flags;
	}
	
	@Override
	public String Use() {
		return description;
	}
	
}
