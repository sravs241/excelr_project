package practice;

public class WideningCasting {
	public void wideningcasting() {
		int i=4;
		double j=i;
		System.out.println(i);
		System.out.println(j);
		
	}

public void narrowCasting() {
	double i=7;
	int j=(int)i;
	System.out.println(i);
	System.out.println(j);
}

public static void main(String[] args) {
	WideningCasting wc=new WideningCasting();
	wc.wideningcasting();
	wc.narrowCasting();
}
}