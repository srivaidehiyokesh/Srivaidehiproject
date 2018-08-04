package week3.day2;

public class ArmstrongNumber {
	public static void main (String[] args) {

		int number,lastDigit,middleDigit,firstDigit;

		for (int i=100; i<=1000;i++) {
			number =0;
			lastDigit=i%10;   //3
			number=i/10; //15
			middleDigit=number%10; //5
			firstDigit=number/10; //1
			int temp=(lastDigit*lastDigit*lastDigit)+(middleDigit*middleDigit*middleDigit)+(firstDigit*firstDigit*firstDigit);

			if(temp==i) {
				System.out.println(i);
			}

		}
	}
}