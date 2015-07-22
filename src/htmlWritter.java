import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
 
import java.io.File;
import java.io.FileOutputStream;


public class htmlWritter implements AlienWritter{

	@Override
	public int saveAlienData(Alien alien) {
		try{
			
			File file = new File("Alien.html");
			if (!file.exists()) {
				file.createNewFile();
			}
            FileOutputStream htmlFileout = new FileOutputStream(file);
            Document doc = new Document();
            PdfWriter.getInstance(doc, htmlFileout);
 
            doc.open();
 
            Paragraph para1 = new Paragraph();
            para1.add(alien.toString()); //.add(Element) is not applicable for Alien.
            doc.add(para1);
 
            doc.close();
            htmlFileout.close();
 
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
