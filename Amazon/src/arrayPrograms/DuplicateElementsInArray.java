package arrayPrograms;

public class DuplicateElementsInArray {
	public static void main(String[] args ) {
		int[] arr={10,20,20,30,50,2,2,30};
		System.out.println("Duplicate elements in the array:");
		 for(int i = 0; i < arr.length; i++) {  
	            for(int j = i + 1; j < arr.length; j++) {  
	                if(arr[i] == arr[j])  
	                    System.out.println(arr[j]);  
				
			}
		}
		
		
	}

}
