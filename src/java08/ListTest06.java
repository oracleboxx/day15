package java08;

import java.util.Stack;

/* 1.입구와 출구가 같아서 가장 먼저 입력된 것이 가장 나중에 나가는 구조이다 즉 First input Last output구조
 *   FILO구조이다
 * 2. 가장 나중에 입력된 것이 가장 먼저 나가는 구조이다. Last Input First Output 구조이다. 줄여서 LIFO구조
 */
public class ListTest06 {

	public static void main(String[] args) {
		Stack myStack =new Stack();
		myStack.push("1.Java");// 스택 맨위에 원소값을 추가
		myStack.push("2.Oracle");
		myStack.push("3.클라이언트 프로그래밍");
		while(!myStack.isEmpty()) { // 현재 스택이 비어있지 않다면
			System.out.println(" "+myStack.pop()); // 스택의 맨위의 원소값을 제거하면서 반환
		}
	}

}
