package main;

import java.util.Scanner;

public class ReadData 
{	
	public void ReadString()
	{
	Scanner sc = new Scanner( System.in );
    System.out.println( "Please enter a line of text" );
    String userInput = sc.nextLine();
    int wordLength = userInput.length(); 
    userInput = userInput.toLowerCase();
    String head1="character";
    String head2="occurrences";
    userInput = userInput.replaceAll( "\\W", " " );     
    userInput = userInput.replaceAll( "  ", " " );  
    //char ch[];
    //ch=userInput.toCharArray();
    System.out.printf(" %-15s %15s %n", head1, head2);
    for(int i=0;i<wordLength;i++)
    {
    	int count=0;
    	  //boolean flag=false;

    		   for(int j=0;j<wordLength;j++)
    		   {
    		
    			   if(userInput.charAt(i)==userInput.charAt(j))//{
    				   count++;
    			   		//flag=true;}
    		   }
    		   if(count!=0 && userInput.charAt(i)!=' ')
    		   {
    			   switch(count)
    			   {
    			   case 1: System.out.printf(" %-15s %15s %n", userInput.charAt(i), "one");
    			   			break;
    			   case 2: System.out.printf(" %-15s %15s %n", userInput.charAt(i), "two");
		   			break;
    			   case 3: System.out.printf(" %-15s %15s %n", userInput.charAt(i), "three");
		   			break;
    			   case 4: System.out.printf(" %-15s %15s %n", userInput.charAt(i), "four");
		   			break;
    			   case 5: System.out.printf(" %-15s %15s %n", userInput.charAt(i), "five");
		   			break;
    			   case 6: System.out.printf(" %-15s %15s %n", userInput.charAt(i), "six");
		   			break;
    			   case 7: System.out.printf(" %-15s %15s %n", userInput.charAt(i), "seven");
		   			break;
    			   case 8: System.out.printf(" %-15s %15s %n", userInput.charAt(i), "eight");
		   			break;
    			   case 9: System.out.printf(" %-15s %15s %n", userInput.charAt(i), "nine");
		   			break;
    			   case 10: System.out.printf(" %-15s %15s %n", userInput.charAt(i), "ten");
		   			break;
		   			default: System.out.printf(" %-15s %15s %n", userInput.charAt(i), "More than ten times");
		   			break;
    			   }
    		   }
    		   //if(userInput.charAt(i)!=' ')
        		   //System.out.println("Character::"+userInput.charAt(i)+ " Occurrences:: "+ count);
    			   //System.out.printf(" %-15s %15s %n", userInput.charAt(i), count);
    	      }
    }
}

