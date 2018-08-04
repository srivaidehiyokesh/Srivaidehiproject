package week1day1.hw;

import java.util.Scanner;

public class StringReverse 
{
    public String reverse(String str) 
    {     
        if ((str==null)||(str.length() <= 1) )
            return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args) 
    {
        StringReverse obj=new StringReverse();
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value to be reversed");
    String  str = sc.next();
        System.out.println("Reverse of \'"+str+"\' is \'"+obj.reverse(str)+"\'");    
    }    
}