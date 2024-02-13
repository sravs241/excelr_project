package JavaPracticeProgram;

public class ReverseArray {
public static void main(String[] args) {
	int[] arr= {1,2,3,4,5};
	System.out.println("Original array elements: ");
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	System.out.println("Array in reverse order: ");
	for(int i=arr.length-1;i>=0;i--) {
		System.out.print(arr[i]+" ");
		
	}
	
	String[] arr1= {"Gitanjali", "Sunitha","Anitha","Anju"};
	System.out.println("Original array elements: ");
	for(int i=0;i<arr1.length;i++) {
		System.out.print(arr1[i]+" ");
	}
	System.out.println();
	System.out.println("Array in reverse order: ");
	for(int i=arr1.length-1;i>=0;i--) {
		System.out.print(arr1[i]+" ");
}
	
	System.out.println();
	String string="This is my world";
	System.out.println("Before: "+string);
	String reverse=" ";
	for(int i=string.length()-1;i>=0;i--) {
		reverse=reverse+string.charAt(i);
		
	}
	System.out.println("After reverse: "+reverse);
}
}
