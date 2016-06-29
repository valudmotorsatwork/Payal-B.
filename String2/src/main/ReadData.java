package main;

import java.util.Scanner;

public class ReadData {

    /**
     * Payal Datta Balsetwar
     * Date:29/6/2016
     */
    public void readString()
    {
        Scanner sc = new Scanner( System.in );
        System.out.println( "Please enter a five letter word" ); 
        String userInput = sc.nextLine();           // get input
        int wordLength = userInput.length();       // get length of string in question
        char[] charArray = new char[ wordLength ];
        int stem = 0;       // stem being the 2nd letter after the first - b(a)the or ba(t)he
        int scan = 0;       // scan count for while loop
        boolean stamp;

        for( int i = 0; i < charArray.length; i++ )     // feed string into char array
        {
            charArray[ i ] = userInput.charAt( i );
        }

        for( int startLetter = 0; startLetter < wordLength; startLetter++ )
        {
            for( int stemLetter = 1; stemLetter < wordLength; stemLetter++ )
            { 
            stem = startLetter + stemLetter;
            if( stem >= wordLength )
                stem = stem - wordLength;
            scan = 0;       // reset scan count after walk for loop
                for( int walk = 0; walk < wordLength - 2; walk++ )
                {
                    System.out.print(  charArray[ startLetter ] );
                    System.out.print(  charArray[ stem ] );
                    stamp = false;      // determines whether a character was printed

                    while( stamp == false )
                    {
                        if( scan == startLetter || scan == stem  )
                        {
                            scan++;
                        }
                        else
                        {
                            System.out.print(  charArray[ scan ] );
                            stamp = true;
                            System.out.println();
                            scan++;
                        }
                    } // end while
                } // end walk for
            } // end stemLetter for
        } // end startLetter for    
    }
}