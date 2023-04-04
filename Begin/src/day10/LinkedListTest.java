package day10;

import java.util.*;
/* 순차적으로 데이터를 저장 : ArrayList
 * 중간에 삽입하거나 삭제 : LinkedList
 */

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<String> list1 = new LinkedList<>();
		list1.add("Hi");
		list1.add("Allo");
		list1.add("Bye");
		System.out.println(list1.size()+"개 저장함");
		
		list1.offer("JSP"); // ADD()와 동일
		list1.offer("Servlet");
		System.out.println(list1.size()+"개 저장함");
		
		list1.addFirst("Hello");
		list1.addLast("Spring");
		
		// 데이터 꺼내기
		String str = list1.get(0);
		System.out.println(str); // Hello
		System.out.println(list1.get(list1.size()-1));
		
		// 데이터 삭제 
		
		// - poll() => 첫번쨰 요소를 반환하고 삭제
		String val = list1.poll();
		System.out.println(val+"을 삭제함");
		System.out.println(list1);
		
		// - pop() : poll()과 동일
		list1.pop();
		System.out.println(list1);
		
		// removeFirst(), removeLast(), pollFirst(), pollLast()
		

		list1.add(3,"Java"); // index 3인곳에 "Java"를 삽입
		System.out.println(list1);
		
		list1.remove(4); // 중간에 삭제
		System.out.println(list1);
		
		
	}
}
