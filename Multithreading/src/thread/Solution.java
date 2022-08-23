package thread;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.HashSet;

interface Addition{
	void sum(int a,int b);
}

public class Solution {
	public static void main(String[] args) {
		
		HashMap<String,Integer> h = new HashMap<String, Integer>();
		
		h.put("giri", 98766325);
		h.put("satish", 98766325);
		h.put("yogi", 98766325);
		h.put("Amruth", 98766325);
		
		Iterator<Entry<String, Integer>> itr=h.entrySet().iterator();
		System.out.println("......................................");
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("......................................");
		
		h.forEach((key,value) ->{
			System.out.println(key+" "+value);
		});
		
		
		System.out.println("......................................");
		
		Addition a=new Addition(){
			public void sum(int a,int b){
				System.out.println(a+b);
			}
		};
		
		a.sum(10, 20);
		
		System.out.println("......................................");
		
		Addition a1=(x,y)->{
			System.out.println(x+y);
		};
		
		a1.sum(20, 30);
		
		System.out.println("......................................");
		
		

	}
}
