/**
 * 
 */
package Thread;

/**
 * @author ustjavafsdb411
 *
 */
public class A implements Runnable{

	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Welcome to Ust");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
