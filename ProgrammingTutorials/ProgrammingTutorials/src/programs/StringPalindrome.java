package programs;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String value="dad";
		
		String anagram=returnAnagram(value);
		
		if(value.equals(anagram))
			System.out.println("Anagram");
		
		else {
			System.out.println("not the one");
		}

	}
	
	public static String returnAnagram(String s)
	{
		if(s.length()==0)
			return s;
		
		return s.charAt(0)+returnAnagram(s.substring(1,s.length()));
		
	}

}
