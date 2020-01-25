package mypractice;
import java.util.*;
import java.io.*;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(" enter the number to get factorial");
		int i, n,facto = 1;
		Scanner fact = new Scanner(System.in);
		n= fact.nextInt();
		for (i=1;i<=n;i++)
		{
			facto=facto*i;
		}
	System.out.println(" factorial of number  is:" + facto);
	
						
		
	}

}
