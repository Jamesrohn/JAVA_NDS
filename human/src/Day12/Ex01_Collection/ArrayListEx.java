package Day12.Ex01_Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {

	public static void main(String[] args) {
		
		//한꺼번에 import : Ctrl +shift + O
		ArrayList<String> list = new ArrayList<>();
		
		//요소 추가
		list.add("Java");		//프로그래밍 언어
		list.add("JDBC");		//Java와 DB를 연결하는 인터페이스
		list.add("JSP");		//Java 서버 페이지
		list.add("SPRING");		//자바기반 웹 개발 프레임 워크
		
		int size = list.size();
		System.out.println("요소 개수 : " + size);
		
		
		//객체 검색
		String first = list.get(0);
		System.out.println("첫번째 기술 스택: " + first);
		
		//반복 1
		System.out.println(">>반복 1");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+" ");			
		}
		System.out.println();
		
		//반복 2
		System.out.println(">>반복 2");
		for (String skill : list) {
			System.out.print(skill + " ");
		} 
		System.out.println();	
		
		//객체 삭제
		list.remove(0);
		list.remove("SPRING");

		System.out.println(list);
		
		//반복 3
		System.out.println(">>반복 3");
		Iterator<String> it = list.iterator();
		int i = 0;
		while ( it.hasNext()) {
			String item  = it.next();
			System.out.println("item : " + i++ + ":" + item);
		}
	}
	
}
