package OopsConcept;

class jan{
	public  void roi(String month) {
		System.out.println("8.3%");
	}
}
	class feb extends jan{
		public  void roi(String month) {
			System.out.println("8.45%");
		}
	}
	class march extends feb{
		public  void roi(String month) {
			System.out.println("8.6%");
		}
	}
public class currentMonth extends march {
		public void roi(String month) {
			System.out.println("8.6%");
	}
		public static void main(String[] args) {
			currentMonth obj=new currentMonth();	
		obj.roi("April");
		}
}
