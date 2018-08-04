package week1.day2;

import java.util.Scanner;

public class LearningArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] studentNames = {"Anu", "Bala", "Divya","Gayu","Hari"};
		int[] age = {23,34,45,22,45};
		char[][] grade = {{'A','D','E','C','B'},{'C','B','A','E','D'},{'A','A','A','B','C'},{'B','B','B','C','A'},{'C','C','C','C','A'}};
		System.out.println("Enter input between 0 to 4");
		Scanner sc =new Scanner(System.in);
		int inputOne=sc.nextInt();
		System.out.println(studentNames[inputOne] +" who is" + age[inputOne] +" years old scored" +grade[inputOne][0] +" ,"+grade[inputOne][1] +" ,"+ grade[inputOne][2]+" ," +grade[inputOne][3] +" ," +grade[inputOne][4] );
		
	}
}
