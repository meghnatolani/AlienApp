# AlienApp
Problem Statement: 
A treaty of friendship has been signed between Aliens and Humans. The aliens are now welcome on Earth and can stay as long as they wish with the Humans. You are the person responsible to register the aliens.

Part A: Create a console based application that accepts alien details like Code Name, Blood Color, No.of Antennas, No. of Legs and Home Planet and then export these details into one of the 2 formats, depending on user’s choice - “plain text” or “PDF”.

Part B: Make the code extensible so that it is easy to ‘plug in’ a new format called ‘foobar’ without making changes to the application code.

How it Works :																																																									
1. Code is done in Eclipse IDE. Clone the repository and it will work.																													
2. For converting text to pdf iText is used. 																																										
Download the jar files from : http://sourceforge.net/projects/itext/?source=typ_redirect																				
To use in eclipse, make a separate folder, import all the jar files into the folder.																						
Right click and Select Build Path.																																															

About the Code :																																																								
Alien.java - Get and set methods for each input variable.																																				
AlienEntryApplication.java - Main method which takes input from console																													
AlienWritter.java - Interface which is implemented by PDFWritter and TextWritter																								
AlienWritterType.java - Calls which AlienWritter type needed - PDF or text file																									
PDFWritter.java - Input stored in Alien is stored to pdf.																																				
TextWritter.java - Input stored in Alien is stored to textfile																																
