package com.bubblesort;

public class BubleSort {

	public static  void sortBubble(int[] arrayOfint)
	{
		int sizeOfarray = arrayOfint.length;
		for(int counter=0;counter<sizeOfarray-1;counter++ )
		{
			for(int secondCounter=0;secondCounter<sizeOfarray-1;secondCounter++)
			{
				if(arrayOfint[secondCounter] > arrayOfint[secondCounter+1])
				{
					int tempVariable = arrayOfint[secondCounter];
					arrayOfint[secondCounter] = arrayOfint[secondCounter+1];
					arrayOfint[secondCounter+1] = tempVariable;
				}
			}
		}
		pirntArray(arrayOfint);
	}
	
	public static void pirntArray(int[] arrayToPrint)
	{
		for(int counter=0;counter<arrayToPrint.length;counter++)
		{
			System.out.print(arrayToPrint[counter]+ " ");
			
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int[] arrayOfInt = {1,5,2,6,4};
		
		BubleSort.sortBubble(arrayOfInt);
	}
}
