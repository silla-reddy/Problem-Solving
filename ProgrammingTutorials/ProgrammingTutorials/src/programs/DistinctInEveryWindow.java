package programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DistinctInEveryWindow {

	/*
	 * given array [1,2,3,4,3,4,5,7]   k=3 size window
	 * 
	 * 1st window [1,2,3] distinct are 3
	 * 2nd window [2,3,4]              3
	 *            [3,4,3]              2
	 *            [3,4,5]              3
	 *            [4,5,7]              3
	 *            
	 * Output [3,3,2,3,3]
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {12,23,22,23,22,21,20};
		distinctElements(a, 3);
	}
	
	public static void distinctElements(int[] a, int k)
	{
		Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
		List<Integer> l=new ArrayList<Integer>();
		for(int i=0;i<k;i++)
		{
			hm.put(a[i],hm.getOrDefault(a[i], 0)+1);
		}
		l.add(hm.size());
		
		
		for(int i=0;i<a.length-k;i++)
		{
			int removeElement=a[i];
			int addElement=a[i+k];
			hm=removeElementFromMap(hm, removeElement);
			hm.put(addElement, hm.getOrDefault(addElement, 0)+1);
			l.add(hm.size());
			
		}
		System.out.println(l);
	}
	
	public static Map<Integer,Integer> removeElementFromMap(Map<Integer,Integer> m,int element) {
		if(m.size()==3) {
			m.remove(element);
			
		}
		else {
			m.put(element, 1);
		}
		return m;
	}

}
