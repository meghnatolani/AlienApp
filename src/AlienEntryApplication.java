import java.io.*;

public class AlienEntryApplication {

	public static void main(String [] args) throws Exception
	{
		boolean retry = false;
		String format=new String();
		Alien a = new Alien();
		
		while(!retry){
	
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter Alien Name ");
        	a.setAlienName(br.readLine());
			
			try {
            System.out.println("Enter Blood Color ");
            a.setColor(br.readLine());
            
            System.out.println("Enter No. of antennas ");
            a.setAntenna(Integer.parseInt(br.readLine()));
            
            System.out.println("Enter No. of legs ");
            a.setLeg(Integer.parseInt(br.readLine()));
            
            System.out.println("Enter Home Planet ");
            a.setPlanetName(br.readLine());
            
            System.out.println("Need in text or pdf? ");
			format=br.readLine();

            }
            
            catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            catch (NumberFormatException e){
            	System.out.println("Oops ! A Number was asked.Start again!");
            		retry=false;
		}
		}
		
		
		AlienWritterType f = new AlienWritterType();
		AlienWritter alienwritter = f.getAlienWritter(format);
		alienwritter.saveAlienData(a);


	}
}