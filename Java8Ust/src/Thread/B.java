/**
 * 
 */
package Thread;

/**
 * @author ustjavafsdb411
 *
 */
public class B implements Runnable{

	public void run() {
		for(int i=0;i<=5;i++) {
		System.out.println("==Welcome==");
		
		try {
			Thread.sleep(1100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
