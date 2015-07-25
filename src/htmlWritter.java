/*HTML file as plugin using FileWriter */

import java.io.*;

public class htmlWritter implements AlienWritter{

	@Override
	public int saveAlienData(Alien alien) {
		try{
			
			File htmlFile = new File("Alien_html.html");
			
			if (!htmlFile.exists()) {
				htmlFile.createNewFile();
			}
			
			FileWriter fWriter = new FileWriter(htmlFile);
			BufferedWriter bWriter = new BufferedWriter(fWriter);
			bWriter.write(alien.toString());
			bWriter.close();

			System.out.println("HTML created");
			return 1;
		}
		catch(Exception e)
		{
			 e.printStackTrace();
		}
		
		return 0;
	}
	
	
}
