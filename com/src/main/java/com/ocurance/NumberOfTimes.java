package com.ocurance;

import java.util.HashMap;
import java.util.Map;

public class NumberOfTimes {
	
	public static void main(String[] args) {
		
		
		String string = "utilites";
		String stringTwo = "silentt";

		//stringMap(string);
		System.out.println(stringMap(string));
		System.out.println(stringMap(stringTwo));
		
		if(stringMap(string).equals(stringMap(stringTwo)))
		{
			System.out.println("Anagram");
		}
	}
	
	public static Map<Character,Integer> stringMap(String str)
	{
		Map<Character,Integer> stringMap = new HashMap<Character,Integer>();
		String string = str;
		
		char[] stringArr = string.toCharArray();
		
		for(char charArr: stringArr)
		{
			if(stringMap.containsKey(charArr))
			{
				stringMap.put(charArr, stringMap.get(charArr)+1);
			}
			else
			{
				stringMap.put(charArr, 1);
			}
		}
		
		
		return stringMap;
	}

}
