public class Alien
{

	private String alien_name;
	private String blood_color;
	private String planet_name;
	private int NoOfAntenna;
	private int NoOfLeg;

	/* Alien Code Name details */
	public void setAlienName(String alien_name)
	{
		this.alien_name=alien_name;
	}
	public String getName()
	{
		return alien_name;
	}

	/* Color of Alien */
	public void setColor(String blood_color)
	{
		this.blood_color=blood_color;
	}
	public String getColor()
	{
		return blood_color;
	}

	/* Home planet of Alien */
	public void setPlanetName(String planet_name)
	{
		this.planet_name=planet_name;
	}
	public String getPlanet()
	{
		return planet_name;
	}

	/* Number of Antennas Alien has */
	public void setAntenna(Integer NoOfAntenna)
	{
		this.NoOfAntenna=NoOfAntenna;
	}
	public Integer getNoOfAntenna()
	{
		return NoOfAntenna;
	}

	/* Number of Legs Alien has */
	public void setLeg(Integer NoOfLeg)
	{
		this.NoOfLeg=NoOfLeg;
	}
	public Integer getNoOfLeg()
	{
		return NoOfLeg;
	}

	/* Output obtained in format */
	@Override
	public String toString()
	{
		return "Alien Details \n\n [ CodeName = " + getName() + " ,BloodColor = "
	            + getColor() + " ,No of Antennas = " + getNoOfAntenna() + " ,No of Legs = " + getNoOfLeg() + " ,HomePlanet = " + getPlanet() + "]";
	}
}