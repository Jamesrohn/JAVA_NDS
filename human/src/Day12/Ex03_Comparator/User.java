package Day12.Ex03_Comparator;

import java.util.Comparator;

public class User implements Comparator<User> {

	String id;
	String name;
	int age;

	
	public User() {
	}

	public User(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compare(User o1, User o2) {
		//정렬 기준 1 : 나이순 - 오름차순
		//정렬 기준 2 : 이름순 - 오름차순
		
		if(o1.age > o2.age) {
			return 1;
		}
		
		if(o1.age < o2.age) {
			return -1;
		}
		
		
		//if(o1.age == o2.age) {
			if(o1.name.compareTo(o2.name)>0) {
				return 1;
			}
			if(o1.name.compareTo(o2.name)<0) {
				return -1;
			}
		//}
		
		return 0;
	}

}
