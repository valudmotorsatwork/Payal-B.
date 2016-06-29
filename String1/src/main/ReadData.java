package main;

import java.util.Scanner;


public class ReadData {

	public void readString()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Sentence::");
		String s1=sc.nextLine();
		String arr[]=s1.split("\\s+");
		String finalArray[] = new String[arr.length];
		//s1.trim();
		int cnt=0;
		for (int i=0;i<arr.length;i++)
		{		
			String temp=arr[i];
			if(arr[i].charAt(0)=='b'||arr[i].charAt(0)=='B')
			{
				finalArray[cnt]=temp;
				cnt++;
			}	
		
			
		}
		//System.out.println("no words ");
		if(finalArray.length==0)
			System.out.println(" no word from b");
		else
		{	
			int i=0;
			while(finalArray[i]!=null)
			{
				System.out.println(finalArray[i]);
				i++;
			}
		}
	}
		
}

		
		
