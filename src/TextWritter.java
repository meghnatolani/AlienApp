/* .txt file created using filewriter and bufferedWriter */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TextWritter implements AlienWritter{

	@Override
	public int saveAlienData(Alien alien) throws IOException {
			
				File file_text = new File("Alientext.txt");
				// if file doesnt exists, then create it
				if (!file_text.exists()) 
					file_text.createNewFile(); 
	 
				FileWriter fw = new FileWriter(file_text.getAbsoluteFile(),true);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(alien.toString());
				bw.close();
	 
				System.out.println("Entry added to Text File");
				return 1;
	}
}
