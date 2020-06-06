package com.learning.hatway;

public class PallianDrome {

	public static void main(String[] args) {
		
		
		String pallianDrome = "abba";
		boolean poly = true;
		
		String rev="";
		for(int i=pallianDrome.length()-1;i>=0;i--)
		{
			rev= rev+pallianDrome.charAt(i);
		}
		
		if(rev.equals(pallianDrome))
		{
			System.out.println("**PALAINDROME******");
		}
		else
		{
			System.out.println("***NOT****PALAINDROME******");
	
		}
		
		
		
		
		StringBuffer bufferedString =new StringBuffer(pallianDrome).reverse();
		System.out.println("Rever"+bufferedString);
		
		for(int i=0;i<pallianDrome.length();i++)
		{
			if(pallianDrome.charAt(i) != bufferedString.charAt(i))
			{
				System.out.println("Not Paliandrome");
			}
			else
			{
				System.out.println("Paliandrome");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		for(int i=0;i<pallianDrome.length()-1/2;i++)
		{
			if(pallianDrome.charAt(i) == pallianDrome.charAt(pallianDrome.length()-1-i) && poly)
			{
				poly=true;
			}
			else
			{
				poly=false;
			}
		}
		
		if(poly)
		{
			System.out.println("Paliandrome");
		}
		else
		{
			System.out.println("Not paliandrome");
		}
	}
}
