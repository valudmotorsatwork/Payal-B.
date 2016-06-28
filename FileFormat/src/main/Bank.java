package main;
/**
Payal Datta Balsetwar
Date:: 27/6/2016
*/
import java.util.List;



import inputoutput.Manipulate;

import inputoutput.WriteToPdf;
import inputoutput.WriteToXLS;

public class Bank {
	public static void main(String[] args) {
		
		Manipulate man=new Manipulate();
		WriteToXLS wtx=new WriteToXLS();
		man.manipulate();
		List<String> data =man.manipulate();
		wtx.writeToXls(data);
		WriteToPdf wtp=new WriteToPdf();
		wtp.writeToPdf(data);
		
	
			
	}
}
