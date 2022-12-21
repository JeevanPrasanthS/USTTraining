/**
 * 
 */
package Syncronization;

/**
 * @author ustjavafsdb411
 *
 */
public class MyThraed extends Thread {
	
	Table t;
	
	public MyThraed(Table t) {
		this.t=t;
	}
	MyThraed(){
		
	}
	public void run() {
		//t.table(5);;
		Table.table(5);
	}

}
