package exam.ex03;

public class Execute {

	public static void main(String[] args) {
		Dog[] d= new Dog[10];
		for (int i = 0; i<d.length; i++) {
			d[i] = new Dog();
			d[i].setName("멍멍이" + i);
			d[i].setAge(i);
		}				
		
		for (int i = 0; i<d.length; i++) {
			System.out.println(d[i].getName());
			System.out.println(d[i].getAge());
		}
	}
}

//Dog d = new Dog();
//d.setAge(10);
//System.out.println("d의 나이는"+ d.getAge());

