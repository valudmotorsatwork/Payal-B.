package dao;



public class GetSet {

	
	private  String companyName;
	private String date;
	private String branchCode;
	private String branchName;
	private double reconDiff;

	 
	 private double tempReconDiff=0.0d;
	 
	    private double tempTotReconDiff=0.0d;
	
		public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public double getTempReconDiff() {
		return tempReconDiff;
	}
	public void setTempReconDiff(double tempReconDiff) {
		this.tempReconDiff = tempReconDiff;
	}
	public double getTempTotReconDiff() {
		return tempTotReconDiff;
	}
	public void setTempTotReconDiff(double tempTotReconDiff) {
		this.tempTotReconDiff = tempTotReconDiff;
	}
	public double getReconDiff() {
		return reconDiff;
	}
	public void setReconDiff(double reconDiff) {
		this.reconDiff = reconDiff;
	}

	
}
