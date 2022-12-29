/**
 * 
 */
package Syncronization;

/**
 * @author ustjavafsdb411
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Table t=new Table();
		//MyThraed m=new MyThraed(t);
		//MyThread1 m1=new MyThread1(t);
		
		MyThraed m=new MyThraed();
		MyThread1 m1=new MyThread1();
		
		m.start();
		m1.start();
	}

}
