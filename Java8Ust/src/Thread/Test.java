package Thread;

public class Test {

	public static void main(String[] args) {
		A a=new A();
		//a.run();
		//a.start();
		
		Runnable t1=new Thread(a);
	//	t1.start();
		
		B b=new B();
		//b.run();
		//b.start();
		
		Runnable t2=new Thread(b);
	//	t2.start();
		
	}
}
