package main;

import java.util.ArrayList;
import java.util.Collections;

import java.util.Scanner;

public class SwitchPairs 
{
	
	
   
	public void switchPairs()
	{
		ArrayList<String> list=new ArrayList<>();
		System.out.println("Enter the no of words you want to enter::");
		Scanner input1=new Scanner(System.in);
		int temp=input1.nextInt();
		
		System.out.println("Enter the input for the list:: ");
		//String inputString;
        for(int i=0;i<temp;i++)
        {
        	list.add(input1.next());
        }
         for(int j=0;j<list.size();j+=2)
         {
	         Collections.swap(list,j,(j+1));
	     }
         System.out.println("The new list = " +list);
		//return list;
	}
}


