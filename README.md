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
Part A Solution :                                                                                                     
Alien.java - Get and set methods for each input variable.																																		
AlienEntryApplication.java - Main method which takes input from console																											
AlienWritter.java - Interface which is implemented by the format given as input (PDF,TXT,HTML..)														
AlienWritterType.java - Calls which AlienWritter type needed - PDF , text file or other format															
PDFWritter.java - Input stored in Alien is stored to pdf.																																		
TextWritter.java - Input stored in Alien is stored to textfile																														

Part B:                                                                                                                       
To plug in a new format, a file named "format.txt" is created. In the text file, just mention the format you want to plug in.
For example, if HTML format has to plugged in, write html in format.txt and plugin the format with the name : "htmlWritter.java". The code will work without any changes needed to be made in the application. What I have done is, in                                   
AlienWritterType.java - If any other format is asked, the string is compared to the strings present in format.txt. If it exists there, it will check if the class with the name - "format"Writter exists or not. IF it does, output is obtained, else the user is asked to recheck the format.                                                                                                      
htmlWritter.java - An example of the above explanation.
