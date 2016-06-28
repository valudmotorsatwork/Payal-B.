package inputoutput;

import java.util.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import dao.GetSet;


public class Manipulate {
	private double reconDiff;
	   private double totReconDiff;
	public List<String> manipulate() // method
	{
		String fileName = "./resource/ass1_input.txt";
		Manipulate man= new Manipulate();
		String line = null;
		String reconDiff;
		GetSet obj=new GetSet();
		double tempRecon_Tot=0.0d;
		double tempRecon=0.0d;
		List<String> data = new ArrayList<>();
		try {
			String[] arr = new String[6];
			FileReader fileReader = new FileReader(fileName);
			int cnt = 0;
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			int i;
			while ((line = bufferedReader.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line);
				if (cnt >= 0) {
					// loop for checking if the line contains "|"
					if (line.contains("|")) {
						System.out.println(line);
						for (i = 0; i <= 5; i++) {
							
							if (st.hasMoreTokens()) {
								
								arr[i] = st.nextToken("|");
								
							
							}
								
						}
						
					}
					// loop for checking if the line contains ";"
					else if (line.contains(";")) {
						for (i = 0; i <= 5; i++) {
							arr[i] = st.nextToken(";");
						
						}
					}

					// loop for checking if the line contains ":"
					else if (line.contains(":")) {
						for (i = 0; i <= 5; i++) {
							arr[i] = st.nextToken(":");
							// obj.setTOTAL_RECON(obj.getTOTAL_RECON()+
							// Double.parseDouble(arr[4]));
						}
					}

					// loop for checking if the line contains " "
					else if (line.contains(" ")) {
						arr[0] = line.substring(0, 8);
						arr[1] = line.substring(9, 19);
						arr[2] = line.substring(19, 22);
						arr[3] = line.substring(22, 28);
						arr[4] = line.substring(29, 36);
						arr[5] = line.substring(40, 53);
						// obj.setTOTAL_RECON(obj.getTOTAL_RECON()+
						// Double.parseDouble(arr[4]));
						// System.out.println(obj.getTOTAL_RECON());
					}
					for (i = 0; i < arr.length; i++) {
						data.add(arr[i]);
					}
					if(cnt!=0)
					{
						tempRecon=tempRecon+ Double.parseDouble(arr[4]);
						setTotReconDiff(tempRecon);
						tempRecon_Tot=tempRecon_Tot+Double.parseDouble(arr[3]);
						setReconDiff(tempRecon_Tot);
					}
					cnt++;
				}
			
			}
			System.out.println("Result-->"+getReconDiff()+" Total Recon Diff-->"+getTotReconDiff());
			System.out.println(obj.getTempReconDiff());
			System.out.println(getReconDiff());
			data.add(String.valueOf(getTotReconDiff()));
			data.add(String.valueOf(getReconDiff()));
			bufferedReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");

		}
		return data;
	}
	public double getReconDiff() {
		return reconDiff;
	}
	public void setReconDiff(double reconDiff) {
		this.reconDiff = reconDiff;
	}
	public double getTotReconDiff() {
		return totReconDiff;
	}
	public void setTotReconDiff(double totReconDiff) {
		this.totReconDiff = totReconDiff;
	}
}
