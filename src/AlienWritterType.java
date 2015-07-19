
public class AlienWritterType {

	public AlienWritter getAlienWritter(String format)
	{
		if(format.equals("text"))
			return new TextWritter();
		else if(format.equals("pdf"))
			return new PdfWritter();
		
		return null;
	}
}
