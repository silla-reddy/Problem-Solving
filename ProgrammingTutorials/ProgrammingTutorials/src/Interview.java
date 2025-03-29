import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Interview {
	
	//string - 'JAVA' reverse
	//string - 'JAVA' J-1, A-2,V-1
	//String - 'ababcdb'
	
	public static void occurence(String str1) {
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		char[] ch = str1.toCharArray();
		
		for(Character c : ch) {
			if(map.containsKey(c)) {
				
				map.put(c, map.get(c)+1);
				
			} else {
				
				map.put(c, 1);
				
			}
		}
		
		System.out.println(map);
		
	}
	
	public static void occurence2(String str2) {
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		Set set = new LinkedHashSet();
		
		char[] ch = str2.toCharArray();
		
		for(Character c : ch) {
			if(map.containsKey(c)) {
				
				map.put(c, map.get(c)+1);
				
			} else {
				
				map.put(c, 1);
				
				set.add(map.keySet());

				
			}
		}
		
		//System.out.println(map);
		System.out.println(set);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "JAVA";
		
		char[] ch = str.toCharArray();
		String reverse = "";
		
		for(int i = str.length()-1;i>=0;i--) {
			
			reverse = str.charAt(i)+reverse;
			
		}
		
		//System.out.println(reverse);
		
		
		//occurence("JAVA");
		occurence("ababcdb");
		
		
	}
	
	

}
