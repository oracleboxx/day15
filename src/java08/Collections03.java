package java08;

import java.util.ArrayList;
import java.util.Iterator;

/* java.util 패키지의 컬렉션 인터페이스 iterator 특징
 * 1.jdk 1.2에서 추가되었기 때문에 같은 버전에서 추가된 컬렉션과 궁합이 잘 맞다. 그러므로 list 컬렉션
 * 	 인터페이스를 구현한 자손 클래스 ArrayList컬렉션에 저장된 복수개의 원소 값을 읽어오는 용도로 사용하면 된다.
 * 
 */
public class Collections03 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		 System.out.println("요소의 개수->"+list.size());
	
		 list.add("하나");
		 list.add("둘");
		 list.add("셋"); // 중복 x
		 
		 list.add("넷");
		 list.add("다섯");
		 Iterator elements = list.iterator();
		 while(elements.hasNext()) {
			 String a= (String) elements.next();
			 System.out.println(a);
		 }
	}

}
