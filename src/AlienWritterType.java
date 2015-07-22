import java.io.*;
import java.util.*;


public class AlienWritterType {

	public AlienWritter getAlienWritter(String format) throws FileNotFoundException
	{
		int flag=0;
		
		if(format.equals("text"))
			return new TextWritter();
		
		else if(format.equals("pdf"))
			return new PdfWritter();
		
		else{
			
			File file2 = new File("compare.txt");
			if (!file2.exists()) {
				System.out.println("To plug in new format, create a text file compare.text,"
									+ " mention the format in the file and then continue.");
				return null;	
				}

			Scanner scan=new Scanner(file2);
			while(scan.hasNext()){
				if(format.equalsIgnoreCase(scan.next().trim()))
						flag=1;	
				}
			
			if(flag==1){
				try{
					Class.forName(format +"Writter");
					}catch (ClassNotFoundException e) {
						System.out.println("Kindly create the class. It doesn't exist."); }
					}
			else{
				System.out.println("Format doesn't exist in the textfile."); 
				}
			
			}
		return null;
	}
}
