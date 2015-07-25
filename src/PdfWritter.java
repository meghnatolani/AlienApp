/*PDF file created using itext */

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
 
import java.io.File;
import java.io.FileOutputStream;

public class PdfWritter implements AlienWritter{

	@Override
	public int saveAlienData(Alien alien) {
		
		try {
			File file = new File("Alien_pdf.pdf");
			if (!file.exists())
				file.createNewFile();
			FileOutputStream pdfFileout = new FileOutputStream(file);
			Document doc = new Document();

			PdfWriter.getInstance(doc, pdfFileout);
			doc.open();
			Paragraph para1 = new Paragraph();
			para1.add(alien.toString()); //.add(Element) is not applicable for Alien.
			doc.add(para1);

			doc.close();
			pdfFileout.close();

			System.out.println("PDF created");
			return 1;
            
			}catch(Exception e){
			 e.printStackTrace();
			}
		
		return 0;
	}
	
	
}
