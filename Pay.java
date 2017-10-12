/*
Pay.java
@ author C Sullivan
14th Feb 2017
*/

public class Pay{
	private double basicPay;
	private double basicHours;
	private double overtimeHours;
	private double basicTotalPay;
	private double totalPay;
	private double otTotalPay;

	public Pay(){
		basicPay=0.00;
		basicHours=0.00;
		overtimeHours=0.00;
		totalPay=0.00;
		basicTotalPay=0.00;
		otTotalPay=0.00;

	}


	public void setBasicPay(double basicPay){
		this.basicPay=basicPay;
	}

	public void setBasicHours(double basicHours){
		this.basicHours=basicHours;
	}

	public void setOvertimeHours(double overtimeHours){
		this.overtimeHours=overtimeHours;
	}



	public void compute(){
		basicTotalPay=(basicPay*basicHours);
		otTotalPay=(overtimeHours)*(basicPay*1.5);
		totalPay=(basicPay*basicHours)+(basicPay*1.5*overtimeHours);
	}



	public double getBasicTotalPay(){
		return basicTotalPay;
	}

	public double getOtTotalPay(){
		return otTotalPay;
	}

	public double getTotalPay(){
		return totalPay;

	}









}
