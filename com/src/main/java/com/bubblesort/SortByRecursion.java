package com.bubblesort;

import java.util.Arrays;

public class SortByRecursion {
	
	static void bubbleSort(int[] arrayList,int sizeOfArray)
	{
		if(sizeOfArray ==1)
			return ;
		for(int counter=0; counter<sizeOfArray-1;counter++)
		{
			if(arrayList[counter] > arrayList[counter+1] )
			{
				int tempVariable = arrayList[counter];
				arrayList[counter]= arrayList[counter+1];
				arrayList[counter+1] = tempVariable;
				
			}
			
			bubbleSort(arrayList, sizeOfArray-1);
		}
	}
	
	public static void main(String[] args) {
		
		int[] arraytosort= {2,4,3,1};
		int sizeOfArray = arraytosort.length;
		bubbleSort(arraytosort, sizeOfArray);
		System.out.println(Arrays.toString(arraytosort));
	}

}
