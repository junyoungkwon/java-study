package exam.ex03;

public class MethodExam01 {
	public String name = "Junyoung";
	
	public static void setTest(MethodExam01 me) {
		me = new MethodExam01();
	}
	public static void main(String[] args) {
		MethodExam01 me = new MethodExam01();
		me.name= "Kwon";
		MethodExam01.setTest(me);
		System.out.println(me.name);
	}
}
