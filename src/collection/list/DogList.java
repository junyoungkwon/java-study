package collection.list;

import java.util.ArrayList;
import java.util.List;

class Dog {
	private String name;
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}

public class DogList {
	public static void main(String[] args) {
		List<Dog> dogList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Dog d = new Dog();
			d.setName("강아지" + i);
			d.setAge(i + 1);
			dogList.add(d);
		}
		for (int i = 0; i < 10; i++) {
			Dog d = dogList.get(i);
			System.out.println(d.getName() + "의 나이는 " + d.getAge());
		}

	}

}
