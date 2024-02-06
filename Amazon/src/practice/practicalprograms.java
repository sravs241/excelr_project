package practice;

import java.util.Scanner;

/*
 * public class factorial { static int factorial(int n){
 * 
 * if(n==1) return 1; else return(n*factorial(n-1));
 * 
 * }
 * 
 * static int n1=0, n2=1,n3=0; static void fibo(int count) { if(count>0) {
 * n3=n1+n2; n1=n2; n2=n3; System.out.print(" "+n3); fibo(count-1); } } public
 * static void main(String[] args) {
 * System.out.println("factorial of 6 is "+factorial(6)); int count=10;
 * System.out.print("Fibonacci series: "+n1 +" " +n2); fibo(count-2); } }
 */


public class practicalprograms{
//	int a,b;
//	factorial(int a, int b){
//		a=a;
//		b=b;
//	}
//	public void show() {
//		System.out.println(a);
//		System.out.println(b);
//	}
//	public static void main(String[] args) {
//		factorial with=new factorial(10,20);
//with.show();
//}}

//static {
//	System.out.println("This is static method");
//}
//public static void main(String[] args) {
//	System.out.println("This is main method");
//}
//}

	public static void main(String[] args) {
		
	try {
		System.out.println(10/0);
//		}catch (Exception e) {
//			e.printStackTrace();
		}catch (ArithmeticException a) {
			a.printStackTrace();
		}catch (NullPointerException a) {
			a.printStackTrace();
		}catch (ClassCastException a) {
			a.printStackTrace();
		}finally {
			System.out.println("This is a finally block");
	}
}	
		
		
		
		
		
	}