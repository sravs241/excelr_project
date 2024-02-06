package arrayPrograms;

public class CopyElementsFromOneToAnother {
	public static void main(String[] args) {
		
		//initialize the arr1
		int[] arr1= {10,20,30,40,50};
		//create another array arr2 with the size of arr1
		int[] arr2=new int[arr1.length];
		//cop the elements from arr1 to arr2
		
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
		}
		//Display elements of array arr1
		System.out.println("Elements of Original array:");
		for(int i=0;i<arr1.length;i++) {
		System.out.print(arr1[i]+ " ");
		}
		
		System.out.println();
		System.out.println("Elements of new array: ");
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
	}

}
