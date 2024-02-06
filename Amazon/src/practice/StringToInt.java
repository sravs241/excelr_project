package practice;

public class StringToInt {
public static void main(String[] args) {
	String s="The Union Cabinet Minister(48 persons)";
	
	//indexOf("(")   and indexOf("pages")
	//int persons=Integer.valueOf(s.substring(s.indexOf("(")+1,s.indexOf("persons")-1));
	//System.out.println(persons);
	
	String union=s.substring(s.indexOf(" ")+1,s.indexOf("Minister")-1);
	System.out.println(union);
	
}
}
