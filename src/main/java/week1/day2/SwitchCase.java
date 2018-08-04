package week1.day2;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String testResultValue ="Passed";
			
			switch (testResultValue) { 
			
			case "Passed":		
			{
			System.out.println("The test cases are passed");
			break;
			}
			case "Failed":		
			{
			System.out.println("The test cases are failed");
			break;
			}
			case "Blocked":
			{
				System.out.println("The test cases are blocked");
				break;
				}
			case "Invalid":
			{
				System.out.println("The test cases are invalid");
				break;
				}
			default :
			{
				System.out.println("Invalid input");
			}
			}
	}
	}


