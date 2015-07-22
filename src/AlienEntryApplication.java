import java.io.*;

public class AlienEntryApplication {

	public static void main(String [] args) throws Exception
	{
		boolean cont = true;
		String format=new String();
		Alien a = new Alien();
		System.out.println("Welcome!");
		
		while(cont){
			System.out.println("Please Fill the following details");
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

			System.out.println("Please enter the format in which you want to save");
			format=br.readLine();
			
			System.out.println("Do you want to save more?Type 'y' for yes and 'n' for no ");
			String opt  = br.readLine();
			if(opt.equals("n"))
				cont = false;

			}catch (Exception e){
				System.out.println("Oops ! A Number was asked.Start again!");
				continue;	
			}		
			
			try{
				AlienWritterType f = new AlienWritterType(); 
				AlienWritter alienwritter = f.getAlienWritter(format);
				alienwritter.saveAlienData(a);
				}catch (NullPointerException e){
					System.out.println("Come Again !");
			}		
			
		}
			
	}

}