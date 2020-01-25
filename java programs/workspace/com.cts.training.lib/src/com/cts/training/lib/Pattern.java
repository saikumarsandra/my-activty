package com.cts.training.lib;

public class Pattern 
{
	public void pattern1(int rows){
		      
		     for(int i=1;i<=rows;i++)
		{
			for(int j=0;j<=rows-i;j++)
			{
				System.out.print(" ");
			}
			       for(int k=1;k<i;k++)
			{
				       System.out.print(k);
			}
			       for (int l=i;l>=1;l--)
			{
				       System.out.print(l);
			}
			System.out.println(" "); 
		}
			
    }

	public void pattern2 (int rows){
		int i,j,k;
		    for(i=1;i<=rows;i++)
		{
			for(j=1;j>i;j++){
				System.out.print(" ");
		}
			for(k=1;k<=i;k++){
				
			System.out.print(" "+i+" ");
			}
			System.out.println("   ");
		}
		}

  
	}


