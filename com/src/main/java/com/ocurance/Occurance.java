package com.ocurance;

import java.util.HashMap;
import java.util.Map;

public class Occurance {

	public static void main(String[] args) {
		
		String str = "bbbaaccbb";
		Map<Character,Integer> hmap = new HashMap<Character,Integer>();
		char[] strChar = str.toCharArray();
		
		for (char ch:strChar)
		{
			
			if(hmap.containsKey(ch))
			{
				hmap.put(ch, hmap.get(ch)+1);
			}
			else
			{
				hmap.put(ch, 1);
			}
		}
		
		for(Map.Entry entry: hmap.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
					
	}
	
}
