package OopsConcept;

public class MethodOverloading {
	
	public static void add(int a,int b) {
		System.out.println(a+b);
	}
	public static void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		MethodOverloading.add(10,20);
		MethodOverloading.add(10,20,30);
	}

}
