package JavaPracticeProgram;

public class ArrayConversion {
	public void step() {
		System.out.println("hello");
		String arr[]= {"b","a","l","u"};
		String join=String.join("", arr);
		System.out.println(join);
		
		
	}
public static void main(String[] args) {
	
	ArrayConversion ac=new ArrayConversion();
	ac.step();
	  // Sample string
    String myString = "Hello";

    // Using toCharArray() method to convert string to char array
    char[] charArray = myString.toCharArray();

    // Accessing individual characters
    char firstChar = charArray[0];
    char secondChar = charArray[1];

    System.out.println("First character: " + firstChar);
    System.out.println("Second character: " + secondChar);
    for (int i = 0; i < myString.length(); i++) {
        String charAsString = String.valueOf(myString.charAt(i));
        System.out.print(  " " + charAsString);
    } 
        String b="Hello Automation world";
        String[] arr1=b.split(" ");
        System.out.println(arr1+ " ");
        for (int i = 0; i < b.length(); i++) {
           // String charAsString = String.(b.charAt(i));
            System.out.print(  " " + arr1);
        } 
	}

}
