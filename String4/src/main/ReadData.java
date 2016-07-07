package main;
import java.util.Scanner;




	import java.util.ArrayList;
	import java.util.Arrays;

	public class ReadData {
		public void readString()
		{
	    Scanner sc = new Scanner( System.in );
	    System.out.println( "Please enter a line of text" );
	    String userInput = sc.nextLine();
	    String head1="Word Length";
	    String head2="Occurences";
	    userInput = userInput.toLowerCase();

    
	                                                        
	                                                        
	    String[] tokens = userInput.split( " " );
	    System.out.println( userInput );

	    ArrayList< String > items = new ArrayList< String >();
	    String arr[]=tokens;
	    items.addAll( Arrays.asList( tokens ) );

	    int count = 0;
	    System.out.printf( " %-15s %15s %n " ,head1,head2);
	    for( int i = 0; i < items.size(); i++ )
	    {	    	
	        
	        for( int j = 0; j < items.size(); j++ )
	        {
	            if( items.get( i ).equals( items.get( j ) ) )
	                count++;
	            if( items.get( i ).equals( items.get( j ) ) && count > 1 )
	                items.remove( j ); 
	          
	        }  
	        
	        System.out.printf(" %-15s %15s %n " ,items.get(i).length(), count );
	        count = 0;
	        
	    }
	    System.out.println("\n");
	    
	}
	}

