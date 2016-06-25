package com.dao;

public class GetSet {

	
	private  String companyName=null;
	private String date="";
	private double TOT_RECON_DIFF=0.0d;
	public double getTOT_RECON_DIFF() {
		return TOT_RECON_DIFF;
	}
	public void setTOT_RECON_DIFF(double tOT_RECON_DIFF) {
		TOT_RECON_DIFF = tOT_RECON_DIFF;
	}
	public String getCompanyName() {
		return companyName;
	}
	public String setCompanyName(String companyName) {
		return this.companyName = companyName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
}
