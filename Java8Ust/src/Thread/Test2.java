/**
 * 
 */
package Thread;

/**
 * @author ustjavafsdb411
 *
 */
public class Test2 extends Thread{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub


	      // Child thread
	      new Thread(() -> { // Lambda Expression
	         for(int i=1; i <= 5; i++) {
	            System.out.println("Child Thread: "+ i);
	            try {
	               Thread.sleep(500);
	            } catch(Exception e) {
	               e.printStackTrace();
	            }
	         }
	      }).start();
	      // Main Thead
	      for(int j=1; j < 5; j++) {
	         System.out.println("Main Thread: "+ j);
	         try {
	            Thread.sleep(500);
	         } catch(Exception e) {
	            e.printStackTrace();
	         }
	      }
	}

}
