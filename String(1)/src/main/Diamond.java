package main;

import java.util.Scanner;

class Diamond {
	  public  void printDiamond() {
		  Scanner sc=new Scanner(System.in);
			System.out.println("Enter a word::");
			String s1=sc.nextLine();
		 
		  StringBuilder sb=new StringBuilder();
		  for(int i=1;i<=s1.length();i++)
          {
                 for(int j=0;j<s1.length()-i;j++)
                 {
                       System.out.print(" ");
                 }
                       System.out.print(s1.substring(0,i));
                       if(i>1){
                             sb = new StringBuilder(s1.substring(0,i-1));
                             String temp = String.valueOf(sb.reverse());
                             System.out.print(temp);
                         }
                 System.out.println( );
          }
          
          for(int i=s1.length()-1;i>0;i--)
          {
                 for(int j=0;j<s1.length()-i;j++)
                 {
                       System.out.print(" ");
                 }
                       System.out.print(s1.substring(0,i));
                       if(i>1){
                             sb = new StringBuilder(s1.substring(0,i-1));
                             String temp = String.valueOf(sb.reverse());
                             System.out.print(temp);
                         }
                 System.out.println( );
          }


	  }
}
			  
