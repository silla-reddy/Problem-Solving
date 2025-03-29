package lamba;


//STILL FUNTIONAL INTERFACE AS IT HAS ONLY ONE ABSTRACT METHOD
@FunctionalInterface
public interface Automobile {
	public final static int MAXSPEED=90;
	public final static int MAXDISTANCE=10000;
	
	Boolean drive(int speed);
	
	static Boolean service(int distance)
	{
		if(distance>MAXDISTANCE)
			return true;
		
		return false;
	}
}
