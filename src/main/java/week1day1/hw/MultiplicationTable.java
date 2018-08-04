package week1day1.hw;

import java.util.Scanner;
public class MultiplicationTable{
 public static void main (String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println ("enter the multiplier value");
int multiplier = sc.nextInt();
System.out.println ("enter the number");
int number = sc.nextInt();
for (int i=1; i<=number;i++)
{
System.out.println(+i +"*" +multiplier +" = " +(i*multiplier));
}
}
}
