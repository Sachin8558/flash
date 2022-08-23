package beautysaloon;

public class DiscountRate {

	public static double serviceDiscountPremium=0.2;
	public static double serviceDiscountGold=0.15;
	public static double serviceDiscountSilver=0.1;

	public static double productDiscountPremium=0.1;
	public static double productDiscountGold=0.1;
	public static double productDiscountSilver=0.1;

	public double getServiceDiscountRate(String type){

		if(type.equals("Premium"))
			return serviceDiscountPremium;
		if(type.equals("Gold"))
			return serviceDiscountGold;
		if(type.equals("Silver"))
			return serviceDiscountSilver;

		return 0.0;

	}


	public double getProductDiscountRate(String type){
		if(type.equals("Premium"))
			return productDiscountPremium;
		else if(type.equals("Gold"))
			return productDiscountGold;
		else if(type.equals("Silver"))
			return productDiscountSilver;
		return 0.0;
	}
	public static void main(String[] args) {

		
		




	}
}
