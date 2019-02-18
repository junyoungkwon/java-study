package oop.inherit;

class Dog1 {
	String name;
	int age;
}

class Cat1 {
	String name;
	int age;
}

class Food {
	String name;
	String type;
}

public class AnimalFood {

	public static void main(String[] args) {
		Dog1[] dogs = new Dog1[10];
		for (int i = 0; i < dogs.length; i++) {
			dogs[i] = new Dog1();
			dogs[i].age = i + 1;
		}

		Cat1[] cats = new Cat1[10];
		for (int i = 0; i > cats.length; i++) {
			cats[i] = new Cat1();
			cats[i].age = i + 1;
		}

		Food[] nameOfFood = new Food[10];
		for (int i = 0; i < nameOfFood.length; i++) {
			nameOfFood[i] = new Food();
		
		}

		System.out.println(dogs[3].age);
		System.out.println(nameOfFood[1].name);
		System.out.println(cats[4].age);
	}
}
