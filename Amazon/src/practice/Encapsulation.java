package practice;

class Employee {
	private int empid;

	public void setEmpId(int empid1) {
		empid = empid1;
	}

	public int getEmpId() {
		System.out.println("Get Employee ID: " + empid);
		return empid;
	}

	public class CompanyEncapsulationDemo {
		public static void main(String[] args) {
			Employee e = new Employee();
			e.setEmpId(101);
			e.getEmpId();

		}
	}
}


//class name {
//
//	//A Java class which is a fully encapsulated class.  
//	//It has a private data member and getter and setter methods.  
//	
//	//private data member  
//	private String name;  
//	//getter method for name  
//	public String getName(){  
//	return name;  
//	}  
//	//setter method for name  
//	public void setName(String name){  
//	this.name=name ; 
//	}  
//	}  
//public class Encapsulation { 
//	public static void main(String[] args) {
//		name Name=new name();
//		Name.setName("sravs");
//		Name.getName();
//		
//	}
//	
//}
	
	

