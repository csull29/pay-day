/*
PayApp.java
@ author C Sullivan
14th Feb 2017
*/

import javax.swing.*;
public class PayApp{
	public static void main(String args[]){

		double basicPay;
		double basicHours;
		double overtimeHours;
		double basicTotalPay;
		double otTotalPay;
		double totalPay;

		Pay myPay;
		myPay = new Pay();

		basicPay=Double.parseDouble(JOptionPane.showInputDialog(null, "What is your basic rate of pay?"));
		myPay.setBasicPay(basicPay);

		basicHours=Double.parseDouble(JOptionPane.showInputDialog(null, "How many basic hours work did you do"));
		myPay.setBasicHours(basicHours);

		overtimeHours=Double.parseDouble(JOptionPane.showInputDialog(null, "How many over-time hours work did you do"));
		myPay.setOvertimeHours(overtimeHours);


			myPay.compute();

			basicTotalPay=myPay.getBasicTotalPay();
			JOptionPane.showMessageDialog(null, "The total amount you earned for your basic hours is €"+basicTotalPay);

			otTotalPay=myPay.getOtTotalPay();
			JOptionPane.showMessageDialog(null, "The total amount you earned for your over-time hours is €"+otTotalPay);

			totalPay=myPay.getTotalPay();
			JOptionPane.showMessageDialog(null, "The total amount you earned is €"+totalPay);









}






	}
