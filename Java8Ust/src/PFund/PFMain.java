/**
 * 
 */
package PFund;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ustjavafsdb411
 *
 */
public class PFMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<PrFund> pf=new PfDao().getDetails();
		Map<PrFund, Double> map=new HashMap<>();
		for(PrFund p:pf) {
			if(p.getSalary()>0 && p.getSalary()<25000) {
				p.setPfDeduct(p.getSalary()*(0.05));
				p.setSalary(p.getSalary()-p.getPfDeduct());
			}else if(p.getSalary()>=25000 && p.getSalary()<50000) {
				p.setPfDeduct(p.getSalary()*(0.07));
				p.setSalary(p.getSalary()-p.getPfDeduct());
			}else if(p.getSalary()>=50000 && p.getSalary()<80000) {
				p.setPfDeduct(p.getSalary()*(0.12));
				p.setSalary(p.getSalary()-p.getPfDeduct());
			}else {
				p.setPfDeduct(p.getSalary()*(0.18));
				p.setSalary(p.getSalary()-p.getPfDeduct());
			}
		
		//	System.out.println("Deducted Provident Fund"+p.getPfDeduct());
			map.put(p, p.getPfDeduct());
			System.out.println(map);
		}

	}

}
