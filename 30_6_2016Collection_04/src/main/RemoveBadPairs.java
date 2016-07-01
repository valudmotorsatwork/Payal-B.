package main;

import java.util.ArrayList;

public class RemoveBadPairs
{
	public void removeBadPairs(ArrayList<Integer> list)
	{	
		if(!list.isEmpty()){
		for(int i=0;i<list.size();i+=2)
		{
			
			if(list.get(i)>list.get(i+1))
			{
				list.remove(i);
				list.remove(i);
			}
		}
		System.out.println(list);
		}
		else
			System.out.println("List is empty...");
	}

}
