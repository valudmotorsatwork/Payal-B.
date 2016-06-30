package mian;
/**
 * Payal Balsetwar
 * Program markLength4 that takes an ArrayList of Strings as a parameter and that 
 * places a string of four asterisks "****" in front of every string of length 4. 
 */
import java.util.ArrayList;


public class Application {

	public static void main(String[] args) {
     ArrayList <String> words = new ArrayList<String>(); 

		        words.add("this");
		        words.add("is");
		        words.add("lots");
		        words.add("of");
		        words.add("fun"); 
		        words.add("for");
		        words.add("every");
		        words.add("java");
		        words.add("programmer");
		    	
		        MarkLength ml=new MarkLength();
		        

		      ml.marklength4(words);
		        
		    }
		}
	
