package selenium;

import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(isAnagram("abc","cba"));
		
		 String inputString = "XYZ";
	        System.out.println("Permutations of inputString(" + inputString + ") are: " + findPermutation(inputString));
	}
	
	public static Boolean isAnagram(String str1,String str2)
	{
		Boolean notAnagram=false;
		if(!(str1.length()==str2.length()))
			return notAnagram;
		for(int i=0;i<str1.length();i++)
		{
			str2=str2.substring(0,str2.indexOf(str1.charAt(i))).concat(str2.substring(str2.indexOf(str1.charAt(i))+1,str2.length()));
		}
		if(str2.isEmpty())
				return !notAnagram;
		else
			return notAnagram;
			
	}
	
	public static Set<String> findPermutation(String inputString) {
        Set<String> set = new HashSet<String>();
        Set<String> set2;
        String stringWithoutFirstChar;
        char firstChar;
       
        if (inputString.length() == 0){
         set.add("");
         return set;
        }
        firstChar = inputString.charAt(0);
        stringWithoutFirstChar = inputString.substring(1);
        set2 = findPermutation(stringWithoutFirstChar);
       
        for (String s : set2) {
         for (int k=0; k<=s.length(); k++){
             set.add(insertCharacter(s, firstChar, k));
         }
        }
        return set;
    }
 
    public static String insertCharacter(String s, char ch, int i) {
        String begin = s.substring(0, i);
        String end = s.substring(i);
        return begin + ch + end;
    }
}
