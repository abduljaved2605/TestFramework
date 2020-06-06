package com.learning.hatway;

public class MaximumDiffrence {
	int maxDiff(int arr[],int size)
	{
		int maxDiff =arr[1] - arr[0];
		int i,j;
		for(i=0;i<size;i++)
		{
			for(j=i+1; j<size;j++)
			{
				if(arr[j] - arr[i] > maxDiff)
				{
					maxDiff=arr[j] - arr[i];
				}
					
			}
		}
		return maxDiff;
	}
	
	
	public static void main(String[] args) {
		MaximumDiffrence maxdiff = new MaximumDiffrence();
		int arr[] = {1,2,90,10,110};
		int sizeOfarray = arr.length;
		System.out.println(maxdiff.maxDiff(arr, sizeOfarray));
		}
	}
