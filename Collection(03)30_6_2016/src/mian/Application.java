package mian;
/**
 * Payal Balsetwar
 * Program markLength4 that takes an ArrayList of Strings as a parameter and that 
 * places a string of four asterisks "****" in front of every string of length 4. 
 */
import java.util.ArrayList;
import java.util.Scanner;


public class Application {

	public static void main(String[] args) {
     ArrayList <String> words = new ArrayList<String>(); 

		System.out.println("Enter the List of 5 words::");
		Scanner input1=new Scanner(System.in);
		for(int i=0;i<=5;i++)
		{
			words.add(input1.next());
		}
		    	
		        MarkLength ml=new MarkLength();
		        

		      ml.marklength4(words);
		        
		    }
		}
	
