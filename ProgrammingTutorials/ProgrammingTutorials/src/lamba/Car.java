package lamba;
import static lamba.Automobile.*; 

public class Car{

	public static void main(String[] args)
	{
		//MAXSPEED IS ACCESSIBLE AS IMPORTED STATIC MEMBERS OF AUTOMOBILE INTERFACE
		System.out.println("Car max speed is "+MAXSPEED);
		
		brake(10);
		
		Boolean isServiceRequired=service(15000);
		System.out.println("Is service required for 15000 kms :"+ isServiceRequired);
		
	}
	
	public static void brake(int speed)
	{
		Automobile a=(kk)->{
			if(kk>MAXSPEED)
				return true;
			
			return false;	
		};
		System.out.println("Apply brake "+ a.drive(speed));
	}
	

}
