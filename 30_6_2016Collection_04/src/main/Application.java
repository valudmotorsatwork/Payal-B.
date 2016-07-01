package main;
/**
 * Payal Datta Balsetwar
 * Date::30_6_2016
 * Assg no 4
 */
import java.util.ArrayList;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) 
	{	
		ArrayList<Integer> data = new ArrayList<Integer>(); 
		
		System.out.println("Enter no of integers::");
		Scanner input1=new Scanner(System.in);
		int temp=input1.nextInt();
		System.out.println("Enter the 6 integer values in the list::");
		
		for(int i=0;i<temp;i++)
		{
			data.add(input1.nextInt());
		}
		if(temp%2==1)
		{
			data.remove(temp-1);
		}
		
		
		RemoveBadPairs rbd=new RemoveBadPairs();
		rbd.removeBadPairs(data);

	}

}
