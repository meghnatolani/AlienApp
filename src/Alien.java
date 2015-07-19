public class Alien
{

private String alien_name;
private String blood_color;
private String planet_name;
private int antenna;
private int leg;

/* get methods */
public String getName(){
	return alien_name;
}

public String getColor(){
	return blood_color;
}

public String getPlanet(){
	return planet_name;
}

public Integer getAntenna(){
	return antenna;
}

public Integer getLeg(){
	return leg;
}

/* set methods */
public void setAlienName(String alien_name){
	this.alien_name=alien_name;
}

public void setColor(String blood_color){
	this.blood_color=blood_color;
}

public void setPlanetName(String planet_name){
	this.planet_name=planet_name;
}

public void setAntenna(Integer antenna){
	this.antenna=antenna;
}

public void setLeg(Integer leg){
	this.leg=leg;
}

@Override
public String toString()

{		return "Alien Details \n [ CodeName = " + getName() + " ,BloodColor = " 
	            + getColor() + " ,No of Antennas = " + getAntenna() + " ,No of Legs = " + getLeg() + " ,HomePlanet = " + getPlanet() + "]";	}

}