class Bond {
	private double coupon = 0;
	private int payments = 0;
	private double interest = 0;
	private double valueMaturity = 0;
		


public Bond() {
	
}

public double getCoupon() {
	return coupon;
}
public void setCoupon(double coupon) {
	this.coupon = coupon;
}
public int getPayments() {
	return payments;
}
public void setPayments(int payments) {
	this.payments = payments;
}
public double getInterest() {
	return interest;
}
public void setInterest(double interest) {
	this.interest = interest;
}
public double getValueMaturity() {
	return valueMaturity;
}
public void setValueMaturity(double valueMaturity) {
	this.valueMaturity = valueMaturity;
}
public static double getPrice() {
	double C = 500;
	int P = 100;
	double I = 5;
	double M = 10000;
	
	
	
	
	return C * (1 - (1/Math.pow(1 + I, P))) + M * 1/Math.pow(1 + I, P);
}
	
public class Problem2 {

	public void main(String[] args) {
		System.out.print("Price of Bond: " + getPrice());
	

		}
	}
}




