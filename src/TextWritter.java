import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/* .txt file created using filewriter and bufferedWriter */

public class TextWritter implements AlienWritter{

	@Override
	public int saveAlienData(Alien alien) throws IOException {
			
				File file = new File("filename.txt");
				// if file doesnt exists, then create it
				if (!file.exists()) 
					file.createNewFile(); 
	 
				FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(alien.toString());
				bw.close();
	 
				System.out.println("Entry added to Text File");
				return 1;
	}
}
