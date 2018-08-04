package week1.day2;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] studentNames = {"Anu", "Bala", "Divya","Gayu","Hari"};
		int[] age = {23,34,45,22,45};
		char[][] grade = {{'A','D','E','C','B'},{'C','B','A','E','D'},{'A','A','A','B','C'},{'B','B','B','C','A'},{'C','C','C','C','A'}};
		
		for (int i=0; i<=4 ;i++)
		{
		System.out.println(studentNames[i] +" who is " + age[i] +" years old scored " +grade[i][0] +" ,"+grade[i][1] +" ,"+ grade[i][2]+" ," +grade[i][3] +" ," +grade[i][4] );
	}
	}
}
