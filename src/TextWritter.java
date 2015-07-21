import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TextWritter implements AlienWritter{

	@Override
	public int saveAlienData(Alien alien) {
			try {
	 
	 
				File file = new File("filename.txt");
	 
				// if file doesnt exists, then create it
				if (!file.exists()) {
					file.createNewFile();
				}
	 
				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(alien.toString());
				bw.close();
	 
				System.out.println("TextFile Created");
	 
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		return 0;
	}
}
