package mypractice;
import java.util.*;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the reverse");
		Scanner num =  new Scanner (System.in);
		int n= num.nextInt();
		int rev=0,rem = 0;
		 while (n!=0)
		{
		 
	      rem=n%10;
		 rev= (rev*10)+rem;
		 n=n/10;
	 
		}
		 System.out.println("the reverse of a number\t"+ rev); 
	}
		
	
}
