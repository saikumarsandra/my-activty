package com.cts.training.lib;


public class Calculate 
{
		     public void reverse (int n){
		    	 int reverse=0;
		 		while(n!=0)
		 		{
		 		reverse=reverse*10;
		 		reverse=reverse+reverse%10;
		 		n=n/10;
		 		System.out.println("the revesrsed number is :"+ reverse);
		 		}
		}
			 
			 public  void words(int n){
				 
				 int div=0,temp,i=1,count=0;
				   temp=n;
				   while(temp>10) {
					   temp=temp/10;
					   i*=10;
					   count++;
				   }
				   while (count>=0) {
					   div=n/i;
					   n=n%i;
					   switch (div)
					   {
					   case 0: System.out.println("zero");
					   break;
					   case 1: System.out.println("zero");
					   break;
					   case 2: System.out.println("zero");
					   break;
					   case 3: System.out.println("zero");
					   break;
					   case 4: System.out.println("zero");
					   break;
					   case 5: System.out.println("zero");
					   break;
					   case 6: System.out.println("zero");
					   break;
					   case 7: System.out.println("zero");
					   break;
					   case 8: System.out.println("zero");
					   break;
					   default:System.out.println("nine");
					  break;
					   }
							System.out.println(" ");					   
							    i=i/10;
							    count--;
    }
}
			 public void expand(int n){
				 int div=0,temp,i=1,count=0;
				   temp=n;
				   while(temp>10) {
					   temp=temp/10;
					   i*=10;
					   count++;
				   }
				   while (count>=0) {
					   div=n/i;
					   n=n%i;
					   if(count>=1) {
						   System.out.println(div+"*"+i+"+");
					   }
					   else
					   {
						   System.out.println(div);
						   count--;
						   i=i/10;
					   }
				   }
				   
				
			 }
}
			 