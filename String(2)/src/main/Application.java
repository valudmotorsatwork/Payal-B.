package main;
/**
 * 
 * @author PBalsetwar
 *Date 29/6/2016
 * Palindrome
 */
public class Application {

	public static void main(String[] args) {
		Palindrome pal=new Palindrome();
		boolean flag=pal.palindrome();
		 if (flag==true) {
		      System.out.println("Palindrome");
		    }
		    else {
		      System.out.println("Not a palindrome");
		    } 	
	}

}
