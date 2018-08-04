package week1.day2;

public class MaximumNumber {

	public static void main(String[] args) {
	int[] numbers= {22, 32, 42, -22, -9};	
	
	int max = numbers[0];
	
	for (int i=1;i<=3;i++) {
	
		if (max > numbers[i]) {
			
					
			System.out.println("maximum number is" +max);
		}
		else 
			System.out.println("max num is" +numbers[i]);
			
	}
}
}
