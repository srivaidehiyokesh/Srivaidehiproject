package week1.homework;

public class FindLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numbers[] = {52,32,42,-22,-9};
			int i = 0;
			
		for (int max : numbers)
		{
					if (max < numbers[i])
			{
				max =numbers[i];
				System.out.println(+max);
		}
					
	}
	}
}
