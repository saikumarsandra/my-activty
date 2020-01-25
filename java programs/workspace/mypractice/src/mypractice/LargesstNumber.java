package mypractice;
import java.io.*;
import java.util.*;

public class LargesstNumber {
	public static void main (String []args) {
		Scanner n1 = new Scanner(System.in);
		Scanner n2= new Scanner(System.in);
		Scanner n3= new Scanner(System.in);
		System.out.println("enter the values of n1 , n2, n3");
		int  num1 =n1.nextInt();
		int  num2 =n2.nextInt();
		int  num3 =n3.nextInt();
		if ( num1>=num2 && num1>=num3)
		{
			System.out.println(" the gretest value is :" +num1);
		
		}
		else if (num2>=num1 && num2>=num3)
		{
			System.out.println("the gretest value is :" + num2);
			
		}
		else {
			System.out.println("the grestest num is :" + num3);
		}
	}

}
