package Optional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PanCard {

	
	public static void main(String[] args) {
		 
		//  String[] cha= {"A","B","C","D","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	      //  String[] num= {"0","1","2","3","4","5","6","7","8","9"};
	        String strPattern = "^[A-Z]{3}[ABCFGHLJPT][A-Z][0-9]{4}[A-Z]$";
	        
	      //  for(String strPAN : strPANNumbers) {
	        //    System.out.println( strPAN + " => " + strPAN.matches(strPattern) );
	        //}
	   //     List<String> cha1=Arrays.asList(cha);
	      //  List<String> num1=Arrays.asList(num);
	        List<String> list=Arrays.asList( "ABC123","1234ABCD12","AAAYX0000A","AAAYY000A0","AAAGY000AA","AAAGY00000", "AAAGY0000A");
	        for(String l:list) {
	      List<String> print= list.stream().filter(list1->list1.substring(0, 4).equals(strPattern)).filter(n->n.substring(5, 8).equals(strPattern)).collect(Collectors.toList());
	        System.out.println(print);
	        }
	}
}
