package programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GroupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] strs=new String[] {"bdddddddddd","bbbbbbbbbbc"};
//for()
System.out.println(groupAnagrams(strs));
	}

	 public static List<List<String>> groupAnagrams(String[] strs) {
	        //create ascii char array and put it as key in hashmap
	        Map<String,List<String>> map=new HashMap<String, List<String>>();
	        List<List<String>> groupedAnagrams=new ArrayList();
	        for(int i=0;i<strs.length;i++){
	            String arr=getAsciiArr(strs[i]);
	            System.out.println(arr);
	            if(map.containsKey(arr)){
	                map.get(arr).add(strs[i]);
	            }
	            else{
	                List<String> list=new ArrayList<String>();
	                list.add(strs[i]);
	                map.put(arr,list);
	            }
	        }
	        for(String arr:map.keySet()) {
	        	groupedAnagrams.add(map.get(arr));
	        }
	        return groupedAnagrams;
	    }

	    public static String getAsciiArr(String str){
	       int arr[]=new int[256];
	       char ch[]=str.toCharArray();
	       String s="";
	       for(int i=0;i<ch.length;i++){
	        arr[ch[i]]++;
	       }
	       for(int i:arr) {
	    	   s=s.concat(" ").concat(String.valueOf(i));
	       }
	        return s;
	    }
	
}
