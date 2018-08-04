package week1day1.hw;
import java.util.Arrays;
import java.util.Scanner;
public class SeconSmallestNumber {
	public static void main(String[] args) {
		int[] numbers = {-3,-5,4};
		Arrays.sort(numbers);
		System.out.println("the second smallest number is " +numbers[1]);
	}

}
