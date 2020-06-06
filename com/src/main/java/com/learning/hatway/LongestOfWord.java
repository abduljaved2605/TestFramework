package com.learning.hatway;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class LongestOfWord {

	public void shortAndLongWord(String string)
	{
		if(string.equals(null))
		{
			return;
		}
		String shortWord="", longWord="";
		int size=string.length(),longest=0;
		String words[] = string.split(" ");
		System.out.println(words);
		for(String word:words)
		{
			if(word.length() <size)
			{
				shortWord=word;
				size=word.length();
			}
			if(word.length() >1)
			{
				longWord=word;
				longest=word.length();
				
			}
		}
		System.out.println("LONGEST WORD  "+longWord);
		System.out.println("SHORT TEST WORD  "+shortWord);
			
	}
	
	public void setInterface()
	{
		
		Set set = new HashSet();
		set.add("6");
		set.add("2");
		set.add("3");
		set.add("6");
		set.add("3");
		set.add("1");


		//set.forEach(System.out::print);
		
		Iterator list = set.iterator();
		while(list.hasNext())
		{
			System.out.println(list.next());
		}
		
		Set treeSet = new TreeSet();
		treeSet.add("3");
		treeSet.add("4");
		treeSet.add("1");
		treeSet.add("1");
		treeSet.add("1");
		treeSet.add("2");
		//treeSet.forEach(System.out::print);
		
		Map<String,String> map = new HashMap<>();
		map.put("IOS", "11");
		map.put("IOS2", "12");
		map.put("IOS3", "13");
		
		Set<String> keys = map.keySet();
		for(String i:keys)
		{
			System.out.println(i+": "+map.get(i));
		}
		
		Iterator mapIter = map.keySet().iterator();
		System.out.println("***********");

		while(mapIter.hasNext())
		{
			System.out.println(mapIter.next());
		}
		System.out.println("****Ended*******");
		System.out.println(map.keySet().toString());
		System.out.println(map);
		
		map.keySet().stream()
					.forEach(System.out::println);
		
		Iterator valuesIterator = map.values().iterator();
		while(valuesIterator.hasNext())
		{
			System.out.println(valuesIterator.next());
		}
		
		for(Map.Entry<String, String> entry:map.entrySet())
{
	System.out.println(entry.getKey()+ "  "+entry.getValue());
}

		

	}
	
	
	public static void main(String[] args) {
		LongestOfWord longestOfWord = new LongestOfWord();
		//MaximumDiffernce mx;
		
		//longestOfWord.shortAndLongWord("The Java is the King");
		longestOfWord.setInterface();
	}
}
