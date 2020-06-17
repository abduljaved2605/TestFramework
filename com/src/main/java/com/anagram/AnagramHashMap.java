package com.anagram;

import java.util.HashMap;
import java.util.Map;

public class AnagramHashMap {
	
	public static void main(String[] args) {
		
		Map<Character,Integer> stringMap = new HashMap<Character,Integer>();
		Map<Character,Integer> stringMapSecond = new HashMap<Character,Integer>();
		
		String stringOne = "listen";
		String stringTwo = "silent";
		
		char[] stringOneArray =  stringOne.toCharArray();
		char[] stringTwoArray = stringTwo.toCharArray();
		
		for(char character:stringOneArray)
		{
			if(stringMap.containsKey(character))
			{
				stringMap.put(character, stringMap.get(character)+1);
			}
			else
			{
				
				stringMap.put(character, 1);
			}
		}
		
		
		for(char character:stringTwoArray)
		{
			if(stringMapSecond.containsKey(character))
			{
				stringMapSecond.put(character, stringMapSecond.get(character)+1);
			}
			else
			{
				
				stringMapSecond.put(character, 1);
			}
		}
		
		
		if(stringMap.equals(stringMapSecond))
		{
			System.out.println(stringMap);
			System.out.println(stringMapSecond);
			System.out.println("anagaram");
		}
	}

}
