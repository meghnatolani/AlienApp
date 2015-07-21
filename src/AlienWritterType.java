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
		
		else {
			File compare = new File("compare.txt");
			Scanner scan=new Scanner(compare);
			while(scan.hasNext()){
				if(format.equalsIgnoreCase(scan.next().trim()))
					flag=1;	
				}
			
			if(flag==1){
				try	{
					Class.forName(format +"Writter");
					} catch (ClassNotFoundException e) {
					System.out.println("Kindly create the class. It doesn't exist."); }
					}
			else {
				System.out.println("Format doesn't exist in the textfile."); 
				 }
			}
		return null;
	}
}
