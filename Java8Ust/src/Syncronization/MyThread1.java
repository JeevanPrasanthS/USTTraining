package Syncronization;

public class MyThread1 extends Thread {
	
Table t;
	
	public MyThread1(Table t) {
		this.t=t;
	}
	public MyThread1() {
		// TODO Auto-generated constructor stub
	}
	public void run() {
		//t.table(10);;
		Table.table(10);
	}

}
