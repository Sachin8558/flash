package beautysaloon;

import java.util.Date;

public class Visit extends Customer{
	
	Customer customer;
	Date date;
	double serviceExpence;
	double productExpense;
	

	Visit(String name,Date date) {
		super(name);
		
		this.date=date;	
	}

	public String getName(){
		return name;
	}

	public double getServiceExpence() {
		return serviceExpence;
	}

	public void setServiceExpence(double serviceExpence) {
		this.serviceExpence = serviceExpence;
	}

	public double getProductExpense() {
		return productExpense;
	}

	public void setProductExpense(double productExpense) {
		this.productExpense = productExpense;
	}
	
	public double getTotalExpense(){
		return serviceExpence+productExpense;
	}
}
