package practice;

public class CallByValueandReference {
	int data=50;
	static void CallByValue(int data) {
		data=data+100;
	}
	int data1=200;
	static void ref(CallByValueandReference dat) {
		dat.data1=dat.data1+200;
		
	}
public static void main(String[] args) {
	CallByValueandReference dat=new CallByValueandReference();
	System.out.println("Before change: "+dat.data);
	dat.CallByValue(500);
	System.out.println("After change: "+dat.data);
	System.out.println("Before Change: "+dat.data1);
	dat.ref(dat);
	System.out.println("After Change: "+dat.data1);
}
}
