package com.pairandodd.app;

public class PairanOdd {

	public static void main(String[] args) 
	{
		int pair=0,odd=0;

		for(int i=1;i<=100;i++)
		{
			System.out.println("The number is: "+i);
			if(i%2==0)
			{
				pair+=i;
			}
			else
			{
				odd+=i;
			}
		}
		
		System.out.println("Pair numbers add: "+pair);
		System.out.println("Odd numbers add: "+odd);
		
	}

}
