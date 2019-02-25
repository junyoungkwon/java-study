package collection.list;

import java.util.ArrayList;
import java.util.List;

class Person2 {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}

public class PersonList2 {
	public static void main(String[] args) {
		List<Person2> pList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Person2 p = new Person2();
			p.setName("name" + i);
			pList.add(p);
		}
		for (int i = 0; i < 10; i++) {
			Person2 p2 = pList.get(i);
			System.out.println(p2.getName());
		}
	}

}
