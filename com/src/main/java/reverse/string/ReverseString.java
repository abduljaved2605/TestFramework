package reverse.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReverseString {
	
	public static void main(String[] args) {
		
		
		String ss = "heelo";
		
		char[] sarr = ss.toCharArray();

		for(int i=sarr.length-1;i>=0;i--)
		{
				System.out.println(sarr[i]);
			
		}
		byteArray(ss);
		reverseStringCollection(ss);
		reverseStringCollection(ss);
		
	}
	
	public static void byteArray(String str)
	{
		byte[] strByaray = str.getBytes();
		byte[] result=new byte [strByaray.length];;
		for(int i=0;i<strByaray.length;i++)
		{
			result[i]=strByaray[((strByaray.length)-i)-1];
					
		}
		System.out.println(new String(result));
		
	}
	
	public static void reverseStringCollection(String str)
	{
		char[] strCharr = str.toCharArray();
		List<Character> listChar = new ArrayList<>();
		for(char cha:strCharr)
		{
			listChar.add(cha);
			
		}
		
		Collections.reverse(listChar);
		Iterator iterator = listChar.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}

}
