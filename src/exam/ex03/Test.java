package exam.ex03;

public class Test {
	public static int num =1;
	
	public static void main(String[] args) {
		Test[] ts = new Test[3];
		for(int i=0;i<ts.length;i++) {
			ts[i] = new Test();
			ts[i].num = i;
		}
		
		for(int i=0;i<ts.length;i++) {
			System.out.println(ts[i].num);
		}
		Test t3 = new Test();
		System.out.println(t3.num);
	}
}
