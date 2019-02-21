package syntax;

public class Condition2 {

	public static void main(String[] args) {
		int a = 3;
//		String str="a는 3이 아니다";	// 애초에 값을 입력 
//		if(a==4) {
//			str = "a는 3이다.";
//		}
		String str = (a == 3) ? "a는 3이다." : "a는 3이 아니다.";
		System.out.println(str);

		String s1 = "Dog";
		System.out.println(s1.toLowerCase().equals("dog")); // shift to Lower Cases then Compare
		System.out.println(s1.equalsIgnoreCase("dog")); // IgnoreCase <= Upper or Lower Case don't matter
		s1.toLowerCase().equals("dog");

	}
}
