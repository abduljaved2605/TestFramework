package com.bubblesort;

import java.util.Arrays;

public class InsertionSort {
	
	public static void insertionSort(int[] arr)
	{
		int sizeOfArray = arr.length;
		for(int counter =1;counter<sizeOfArray;counter++)
		{
			int key = arr[counter];
			int j=  counter-1;
			while(j >=0 && arr[j] > key)
			{
				arr[j+1] = arr[j];
				j=j-1;
				
			}
			arr[j+1]=key;
		}
	}
	public static void main(String[] args) {
		
		int[] arr = {10,9,2,11,13,14};
		InsertionSort.insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
