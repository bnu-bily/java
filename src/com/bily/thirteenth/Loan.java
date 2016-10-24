package com.bily.thirteenth;


/**
 * 修改程序10-2，如果贷款总额，利率，或年数小于等于0.则抛出一个IllegalArgumentExcetion
 * @author Administrator
 *
 */
/*class IllegalArgumentExcetion extends Exception{
	
	public IllegalArgumentExcetion(){
		super("invalid");
	}
	
	
	
}*/
public class Loan {
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;
	
	public Loan() throws IllegalArgumentException{
		this(2.5, 1, 1000);
	}
	
	public Loan(double annualInterestRate, int numberOfYears, double loanAmount)throws IllegalArgumentException{
		if (annualInterestRate > 0 && numberOfYears > 0 && loanAmount > 0) {
			this.annualInterestRate = annualInterestRate;
			this.numberOfYears = numberOfYears;
			this.loanAmount = loanAmount;
			loanDate = new java.util.Date();			
		} else {
			throw new IllegalArgumentException("贷款总额，利率，或年数小于等于0");
		}
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public int getNumberOfYears() {
		return numberOfYears;
	}

	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public java.util.Date getLoanDate() {
		return loanDate;
	}
	
	public double getMonthlyPayment(){
		double monthlyInterestRate = annualInterestRate / 1200;
		return loanAmount * monthlyInterestRate / (1-
				(Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12)));
	}
	
	public double getTotalPayment(){
		return getMonthlyPayment() * numberOfYears * 12;
	}
	
	public static void main(String[] args) {
		
		try {
			Loan loan1 = new Loan();
			Loan loan2 = new Loan(0.0, 0, 1000.0);
			
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

}
