/*HTML file as plugin using FileWriter */

import java.io.*;

public class htmlWritter implements AlienWritter{

	@Override
	public int saveAlienData(Alien alien) {
		try{
			
			File file_html = new File("Alienhtml.html");
			
			if (!file_html.exists()) {
				file_html.createNewFile();
			}
			
			FileWriter fWriter = new FileWriter(file_html.getAbsoluteFile(),true);
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
