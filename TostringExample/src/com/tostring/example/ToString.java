package com.tostring.example;

public class ToString {
	int roll_no;
	String name,city;
	
	
	public ToString(int roll_no, String name, String city) {
	
		this.roll_no = roll_no;
		this.name = name;
		this.city = city;
	}
	public String toString()
	{
		return roll_no +"  "+name +"  "+city ;
		
	}


	public static void main(String[] args) {
		ToString str=new ToString(1, "Payal", "Aurangabad");
		
		System.out.println(str);

	}

}
