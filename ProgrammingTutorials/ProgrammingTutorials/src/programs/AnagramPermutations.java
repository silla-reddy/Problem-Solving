package programs;

import java.util.HashSet;
import java.util.Set;

public class AnagramPermutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(getAllSetsOFAnagram("abc").toString());
	}
	
	public static Set<String> getAllSetsOFAnagram(String str)
	{
		Set<String> set=new HashSet<>();
		Set<String> set1;
		
		if(str.length()==0)
		{
			set.add("");
			return set;
		}
		char firstChar=str.charAt(0);
		String exceptFirst=str.substring(1);
		set1=getAllSetsOFAnagram(exceptFirst);
		
		for(String s: set1)
		{
			for(int i=0;i<=s.length();i++)
			{
				String a=positionShift(s,firstChar,i);
				set.add(a);
			}
			
		}
		
		return set;
	}
	public static String positionShift(String s,char c,int i)
	{
		
		String begin=s.substring(0,i);
		String end=s.substring(i);
		return begin+c+end;
	}

}
