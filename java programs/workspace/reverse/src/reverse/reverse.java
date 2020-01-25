package reverse;
import java.util.Scanner;
public class reverse {

	public static void main(String[] args) 
	{
		int n,reverse=0,rem=0;
		System.out.println("enter the number to be reversed");
		Scanner in= new Scanner(System.in);
		n=in.nextInt();

		while(n!=0)
		{
		rem=n%10;
		reverse= (reverse*10)+rem;
		n=n/10;
		
		}
		System.out.println("the revesrsed number is :"+ reverse);
		}

	}

