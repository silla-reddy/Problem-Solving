package guice.Test;

public class Adiscount implements Sale,TestProvidd{
	
	public void discount()
	{
		System.out.println("Adiscount is deducted");
	}
	public void testProvideA()
	{
		System.out.println("Provide is testred");
	}
}
