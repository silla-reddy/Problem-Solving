import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s='A';
//		System.out.println(s);
//		isAnagram("rat","atr");
//		System.out.println(isAnagram("rat","bqt"));
		System.out.println(twoSum(new int[]{3,2,3},6)[0]);
		System.out.println(twoSum(new int[]{3,2,3},6)[1]);
	}
	
	public static boolean isAnagram1(String s, String t) {
        if(s.length()!=t.length())
        	return false;
        
        int sum1=0;
        int sum2=0;
        
        for(int i=0;i<s.length();i++) {
        	sum1=sum1+s.charAt(i);
        	sum2=sum2+t.charAt(i);
        }
        if(sum1==sum2)
        	return true;
        
        return false;
    }
	
	public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        	return false;
        
        Set<Character> set=new HashSet<Character>();
        
        for(int i=0;i<s.length();i++) {
        	if(s.charAt(i)!=t.charAt(i)) {
        		if(set.contains(s.charAt(i))){
        			set.remove(s.charAt(i));
        		}
        		else {
        			set.add(s.charAt(i));
        		}
        		if(set.contains(t.charAt(i))) {
        			set.remove(t.charAt(i));
        		}
        		else {
        			set.add(t.charAt(i));
        		}
        	}
        	
        }
        if(set.size()==0) {
        	return true;
        }
        
        
        return false;
    }
	
	public static boolean isAnagram2(String s, String t) {
        if(s.length()!=t.length())
        	return false;
        
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        char ch1[]=s.toCharArray();
        char ch2[]=t.toCharArray();
        
        for(char ch: ch1) {
        	if(map.containsKey(ch)) {
        		map.put(ch, map.get(ch)+1);
        	}
        	else {
        		map.put(ch, 1);
        	}
        }
        
        for(char ch: ch2) {
        	if(map.containsKey(ch)) {
        		map.put(ch, map.get(ch)-1);
        		if(map.get(ch)==0)
        			map.remove(ch);
        	}
        	else {
        		return false;
        	}
        }
    
        
        return map.isEmpty();
    }
	
	public static int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int start=0;
        int mid=nums.length/2;
        int end=nums.length-1;
        boolean find=false;
        if((nums[start]+nums[mid])>=target){
            end=mid;
            for(int i=0;i<=end;i++){
                for(int j=i+1;j<=end;j++){
                    if(nums[i]+nums[j]==target){
                    	start=i;
                    	end=j;
                        break;
                    }
                }
            }
            
        }
        else {
        	start=mid;
        	for(int i=start;i<=end;i++) {
        		for(int j=start+1;j<=end;j++) {
        			if(nums[i]+nums[j]==target){
                    	start=i;
                    	end=j;
                        break;
                    }
        		}
        	}
        }
        return new int[] {start,end};
    }
}
