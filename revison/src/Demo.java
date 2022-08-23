import java.math.BigInteger;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);

		//String a;

		long sum=0;
		BigInteger a=in.nextBigInteger();
		BigInteger b=in.nextBigInteger();

		
		for(int i=0;i<128;i++){
			BigInteger a1=a.mod(new BigInteger("100000000"));
			a=a.divide(new BigInteger("100000000"));
			int a2=a1.intValue();
			

			BigInteger b1=b.mod(new BigInteger("100000000"));
			b=b.divide(new BigInteger("100000000"));
			int b2=b1.intValue();
			

			while(a2>0 & b2>0){
				
				sum=sum+a2%10*b2%10;
				a2/=10;
				b2/=10;
				
			}

		}




		System.out.println(sum);



	}

}
