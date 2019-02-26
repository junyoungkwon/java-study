package collection.list;

import java.util.ArrayList;
import java.util.List;

class Cat {
	private String name;
	private int age;

	public Cat() {
		super();
	}

	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
		return "Cat [name=" + name + ", age=" + age + "]";
	}
}

public class CatList {

	public static void main(String[] args) {
		Cat cat = new Cat();
		List<Cat> catList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			cat = new Cat();
			cat.setName("냥이" + (i+1));
			cat.setAge((int)(Math.random()*30) +1);
			catList.add(cat);
		}
		for (Cat c: catList) {
			System.out.println(c);
		}

	}

}
