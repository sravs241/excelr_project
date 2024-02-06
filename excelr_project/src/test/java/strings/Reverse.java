package strings;

public class Reverse {
	public static void main(String[] args) {
		String string="LittleCaterpillars";
		String reverse="";
//		for(int i=string.length()-1;i>=0;i--) {
//			reverse=reverse+string.charAt(i);
//			
//		}
//		System.out.println("Original string: "+string);
//		System.out.println("Reversed String: "+reverse);
		System.out.println(string);
		int i=string.length();
		while(i>0) {
			System.out.print(string.charAt(i-1));
			i--;
		}
		
		
		
		
	}

}
