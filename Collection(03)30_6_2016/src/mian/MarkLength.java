package mian;

import java.util.ArrayList;

public class MarkLength {

	public ArrayList <String> marklength4(ArrayList <String> marklen)
	{
		ArrayList<String> temp=new ArrayList<>();
		
        for(String n:marklen){
            if(n.length()==4)
                	temp.add("****");
            temp.add(n);
            
        }
        System.out.println(temp);
		return temp;
    }

	
}
