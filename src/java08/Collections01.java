package java08;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
/* 1.하나 이상의 복수개의 원소값을 동시 저장 가능하다
 * 2. 복수개의 자료형 타입을 동시 저장할 수 있다.
 * 3. 변화하는 가변적 배열이다.
 * 4. 저장되는 순서를 보장하지 않는다
 * 5. 중복원소값을 허용하지 않는다.
 */
public class Collections01 {

	public static void main(String[] args) {
		 HashSet<String> set =new HashSet<>();
		 System.out.println("요소의 개수->"+set.size());
		 set.add("하나");
		 set.add("둘");
		 set.add("셋"); // 중복 x
		 
		 set.add("넷");
		 set.add("다섯");
		 System.out.println("요소의 개수->"+set.size());
		 System.out.println(set);
	
	}

}
