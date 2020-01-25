package mypractice;
import java.util.*;
public class Armstrong {
	public static void main ( String[] args)
	{
		  int number, originalNumber, remainder, result = 0;
		  System.out.println("enter the number to check");
		  Scanner n= new Scanner(System.in);
		  number=n.nextInt();
	        originalNumber = number;
	        while (originalNumber != 0)
	        {
	            remainder = originalNumber % 10;
	            result += Math.pow(remainder, 3);
	            originalNumber /= 10;
	        }
	        if(result == number)
	            System.out.println(number + " is an Armstrong number.");
	        else
	            System.out.println(number + " is not an Armstrong number.");
	    }
	}