import java.util.HashMap;
import java.util.Map;

public class Test1111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] countries= {"India","aus","India","PAk"};
		duplicates(countries);
	}
	
	public static void duplicates(String[] countries)
	{
		Map<String,Integer> map=new HashMap<>();
		for(String country: countries)
		{
			if(map.containsKey(country))
			{
				map.put(country,map.get(country)+1);
			}
			else
				map.put(country,1);
		}
		map.forEach((key,value)->
		{
			if(value>1)
				System.out.println(key);
		});
	}

}
