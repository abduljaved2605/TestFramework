package com.anagram;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		
		String string_one="listen";
		String string_two = "silent";
		
		char[] string_one_array = string_one.toCharArray();
		char[] string_two_array = string_two.toCharArray();
		
		Arrays.sort(string_one_array);
		Arrays.sort(string_two_array);
		
		System.out.println(string_one_array);
		System.out.println(string_two_array);

		if((string_one_array.toString()).equals (string_two_array.toString()))
		{
			System.out.println("Equal");
		}
		
	}
	
}
