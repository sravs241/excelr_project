package Arrays;

public class SortedArray {
public static void main(String[] args) {
	int[] arr= {30,50,10,20};
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}}
		for(int data: arr) {
			System.out.print(data+" ");
		
	}
}
}
