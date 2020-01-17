/**
Display two strings and then join the strings and display the length.
Author: Daniel Oszczapinski	
Homework 2: Assignment 1
Completed: September 26, 2016
*/
import java.util.Scanner;


public class LengthProblem
{
	public static void main(String[] args)
	{
		String string1, string2;
	
		Scanner in = new Scanner(System.in);
	
		System.out.println("Enter two strings");
		string1 = in.nextLine();
		string2 = in.nextLine();
		System.out.println("You entered string");
		System.out.println(string1);
		System.out.println(string2);
		System.out.println (string1.length());
		System.out.println (string2.length());
		System.out.println(string1+ " " +string2);
		System.out.print (string1.length());
		System.out.print (" ");
		System.out.print (string2.length());
	}
}