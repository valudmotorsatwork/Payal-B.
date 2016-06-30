package main;
import java.util.*;
public class Palindrome {
	
	 
	
	  public  boolean palindrome()
	  {
	    String s1;
	    Scanner in = new Scanner(System.in);
	 
	    System.out.println("Input a string in lower case::");
	    s1 = in.nextLine();
	    
	   String inputString=s1.toLowerCase();
	    
	    
	    boolean flag=true;
	 
	    int length  = inputString.length();
	    int i, begin, end, middle;
	 
	    begin  = 0;
	    end    = length - 1;
	    middle = (begin + end)/2;
	 
	    for (i = begin; i <= middle; i++) {
	      if (inputString.charAt(begin) == inputString.charAt(end)) {
	        begin++;
	        end--;
	      }
	      else if(inputString.charAt(begin)=='|' || inputString.charAt(begin)==',' || inputString.charAt(begin)=='.' || inputString.charAt(begin)==':' || inputString.charAt(begin)==';' || inputString.charAt(begin)=='!')
	    	  begin++;
	        
	      
	    	else if(inputString.charAt(end)=='|' || inputString.charAt(end)==',' || inputString.charAt(end)=='.' || inputString.charAt(end)==':' || inputString.charAt(end)==';' || inputString.charAt(end)=='!')
	    	{
	    	end--;
	   		}
	    else{
	    	flag=false;
	    	break;
	    	}
	    	
	    }
		return flag;
	   
	  }
	}

