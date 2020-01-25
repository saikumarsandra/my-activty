package com.cts.training.lib;

public class ArrayImplementation {
 
	public void average ( int[] arr) {
	
	float avg=0;
	int sum=0,len,count =0;
	len= arr.length;
	for(int i=0;i<len;i++)
	{
		if (arr[i]%5==0)
		{
			sum=sum+arr[i];
			count++;
			System.out.println(count);
			avg=sum/count;
		}
	System.out.println(avg);
	}			
 }
	
 
 public void  minloc(int[] arr) {
	
	 int loc=0;
	 int min =arr[0];
	for (int i=0;i<arr.length;i++) {
		
	 if (min> arr[i])
	 {
		 min=arr[i];
		 loc=i;
		 
	 }
 }
System.out.println("smallest value location is :"+ loc);
}
}

