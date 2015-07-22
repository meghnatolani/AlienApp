import java.io.*;
import java.util.*;

public class AlienWritterType {

	public AlienWritter getAlienWritter(String format) throws FileNotFoundException
	{
		int flag=0;
		/* returns text format */
		if(format.equals("text"))
			return new TextWritter();
		/* return pdf format */
		else if(format.equals("pdf"))
			return new PdfWritter();
		
		/*for new plugins added */
		else{	
			File file2 = new File("Format.txt");
			if (!file2.exists()) {
				System.out.println("To plug in new format, create a text file Format.text,"
									+ " mention the format in the file and then continue.");
				return null;	
				}
			
			/*Checks if the format asked is present in text file, if so, flag is set */
			Scanner scan=new Scanner(file2);
			while(scan.hasNext()){
				if(format.equalsIgnoreCase(scan.next().trim()))
						flag=1;	
				}
			
			/* Format class is instantiated if it exists, else error */
			if(flag==1){
				try{
					Class newFormat=Class.forName(format+"Writter");
					AlienWritter result = (AlienWritter)newFormat.newInstance();
					return result;
					
					}catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
						System.out.println("Kindly create the class. It doesn't exist."); 
					}
				}
			else	{
				System.out.println("Format doesn't exist in the textfile."); 
				}
			
			}
		return null;
	}
}
