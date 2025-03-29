import java.util.HashMap;
import java.util.Map;

public class Test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countChar("Rajasekhar");
	}
	
	
	public static void countChar(String str)
	{
		str=str.toLowerCase();
		char[] ch=str.toCharArray();
		Map<Character,Integer> map=new HashMap<>();
		
		for(char c:ch)
		{
			if(map.containsKey(c))
				map.put(c,map.get(c)+1);
			
			else
			{
				map.put(c,1);
			}
		}
		
		for(char c:map.keySet())
		{
			System.out.println(c+"  "+map.get(c));
		}
	}
	
	//File fs=(Takescreenshot)driver.getScreenshotas(OutputType.asFile);

}
