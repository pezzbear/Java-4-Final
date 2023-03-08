
public class CustomExceptionTest {
	public String getVar(String modifier)
	throws CustomException
	{
		if(modifier != "Walk") {
			throw new CustomException("Anything but that");
		}
		else
		{
			return "Thanks";
		}
	}
}
