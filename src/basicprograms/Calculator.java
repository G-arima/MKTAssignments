package basicprograms;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter the value of a");
		int a=s1.nextInt();
		System.out.println("Please enter the value of b");
		int b=s1.nextInt();
		int sum=a+b;
		int sub=a-b;
		int mul=a*b;
		int div=a/b;
		int modulus=a%b;
		System.out.println("Addition of two numbers is : " +sum);
		System.out.println("Subtraction of two numbers is : " +sub);
		System.out.println("Multiplication of two numbers is : " +mul);
		System.out.println("Division of two numbers is : " +div);
		System.out.println("Modulus of two numbers is : " +modulus);
		
		
		

	}

}
