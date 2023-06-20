package java08;
/* 1.복수개의 원소값, 복수개의 자료형을 동시 저장 가능하다. 가변적 크기
 * 2.저장되는 순서를 유지한다.
 * 3.중복원소값을 허용한다. 실제 가장 많이 사용되고 중요한 컬렉션에 해당한다.
 * 4.제일중요한
 */
import java.util.ArrayList;

public class Collection02 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		 System.out.println("요소의 개수->"+list.size());
	
		 list.add("하나");
		 list.add("둘");
		 list.add("셋"); // 중복 x
		 
		 list.add("넷");
		 list.add("다섯");
		 System.out.println("요소의 개수->"+list.size());
		 System.out.println(list);
		 for(int i=0; i<list.size(); i++) {
			 System.out.println(list.get(i));
		 }
	}

}
