package pattern;

import java.util.Scanner;

public class Pattern 
{
	public static void main(String args[])
	{
		int i,j,k,l;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter rows");
		int row=scan.nextInt();
		for(i=1;i<=row;i++)
		{
			for(j=1;j>i;j++)
			{
				System.out.print(" ");
			}
				for(k=1;k<=i;k++)
				{
				System.out.print(""+" "+i+" ");
			}
			System.out.println("   ");
		}
			     for(k=1;k<i;k++)
			{
				       System.out.print(k);
			}
			    for (l=i;l>=1;l--)
			{
				       System.out.print(l);
			}
			System.out.println(" ");
		}
	}

