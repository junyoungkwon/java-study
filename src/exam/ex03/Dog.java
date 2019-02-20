package exam.ex03;

public class Dog {
	private String name;
	private int age;

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public void setAge(int age) {
		this.age = age; // get, set method 반드시 값을 가져오거나 대입하는 것.
	}

	public int getAge() {
		return this.age;
	}

}
