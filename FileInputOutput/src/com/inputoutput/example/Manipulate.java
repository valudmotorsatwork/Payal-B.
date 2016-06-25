package com.inputoutput.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java.io.IOException;
import java.util.StringTokenizer;

import com.dao.GetSet;;

public class Manipulate {
	
	public GetSet manipulate(){
	String fileName = "./resource/ass1_input.txt";
	String line = null;
	//double TOT_RECON_DIFF = 0.0d;
	GetSet obj=new GetSet();
	String arr[] = new String[6];
	{
	try {

		FileReader fileReader = new FileReader(fileName);

		BufferedReader bufferedReader = new BufferedReader(fileReader);

	
		int i;
		int cnt = 0;
		while ((line = bufferedReader.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(line);
			if (cnt != 0) {
				//loop for checking if the line contains  "|"  
				if (line.contains("|")) {

					for (i = 0; i <= 5; i++) {
						arr[i] = st.nextToken("|");
						obj.setCompanyName(arr[5]);
						obj.setDate(arr[1]);

					}
					//System.out.println(arr[4]);
					obj.setTOT_RECON_DIFF(obj.getTOT_RECON_DIFF()+ Double.parseDouble(arr[4]));
					

				}
				//loop for checking if the line contains  ";"
				else if (line.contains(";")) {
					for (i = 0; i <= 5; i++) {
						arr[i] = st.nextToken(";");
						obj.setCompanyName(arr[5]);
						obj.setDate(arr[1]);
					}

					obj.setTOT_RECON_DIFF(obj.getTOT_RECON_DIFF()+ Double.parseDouble(arr[4]));

				}
				//loop for checking if the line contains  ":"
				else if (line.contains(":")) {
					for (i = 0; i <= 5; i++) {
						arr[i] = st.nextToken(":");

						obj.setCompanyName(arr[5]);
						obj.setDate(arr[1]);
					}

					obj.setTOT_RECON_DIFF(obj.getTOT_RECON_DIFF()+ Double.parseDouble(arr[4]));

				}
				//loop for checking if the line contains  " "
				else if (line.contains(" "))

				{
					
					arr[1] = line.substring(9, 19);
					arr[4] = line.substring(29, 36);
					arr[5] = line.substring(40, 50);
					obj.setCompanyName(arr[5]);

					obj.setTOT_RECON_DIFF(obj.getTOT_RECON_DIFF()+ Double.parseDouble(arr[4]));
					
				}

			}
			cnt++;
		}
		obj.setTOT_RECON_DIFF(obj.getTOT_RECON_DIFF());
		System.out.println("Result "+obj.getTOT_RECON_DIFF());
		bufferedReader.close();
	}catch (FileNotFoundException ex) {
		System.out.println("Unable to open file '" + fileName + "'");
	} catch (IOException ex) {
		System.out.println("Error reading file '" + fileName + "'");
	}
	}
	return obj;
	}
}

