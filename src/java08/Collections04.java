package java08;

import java.util.Enumeration;
import java.util.Vector;

public class Collections04 {

	public static void main(String[] args) {
		Vector vec =new Vector();
		for(int i=1 ; i<=3; i++) {
			vec.add(new Integer(i*10));
		}
		Enumeration enu2 =vec.elements();
		while(enu2.hasMoreElements()) {
			System.out.println(enu2.nextElement());
		}
		System.out.println("===============");
	}
	
	

}
