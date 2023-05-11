package Day12.Ex02_Comparable;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PersonList {

	public static void main(String[] args) {
		
		Person p1 = new Person("김휴먼", 20);
		Person p2 = new Person("이휴먼", 24);
		Person p3 = new Person("황휴먼", 15);
		Person p4 = new Person("권휴먼", 30);
		Person p5 = new Person("최휴먼", 40);
		
		LinkedList<Person> personList = new LinkedList<>();
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		personList.add(p4);
		personList.add(p5);
		
		//Person 객체에 구현된 compareTo() 메소드의 비교 기준으로 정렬
		Collections.sort(personList);
		
		for (Person person : personList) {
			System.out.println(person.name + " : " + person.age);
		}
	}
	
}
