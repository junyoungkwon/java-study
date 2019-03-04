package oop.abst;

interface Test {
	public void play();
	public void run();
}
class Child extends AbstractTest{
	
	public void play() {
	}
	public void run() {
	}
	
}

public abstract class AbstractTest implements Test{
	AbstractTest(){
		System.out.println("난 됨");
	}
	
	public static void main(String[] args) {
		AbstractTest at = new Child();
		at.play();
	}
}
