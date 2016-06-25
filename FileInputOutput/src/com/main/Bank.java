package com.main;

import java.io.*;
import com.dao.GetSet;
import com.inputoutput.example.Manipulate;

public class Bank {
	public static void main(String[] args) {
		GetSet obj=new GetSet();
		Manipulate man=new Manipulate();
		obj=man.manipulate();
		String values = "Company Name:: " + obj.getCompanyName() + "  " + "TOT_RECON_DIFF::" + " " + obj.getTOT_RECON_DIFF()
				+ " Date:: " + obj.getDate() + " ";
		
		//code to write the file to Output.txt file 
		FileWriter filewriter;
		try {
			filewriter = new FileWriter("Output.txt");
			filewriter.write(values);
			System.out.println("Success");
			filewriter.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

		
		
	}
}
