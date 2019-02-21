package syntax;

public class Loop2 {

	public static void main(String[] args) {

//		int i =10;
//		for (;i>=0;i--) {
//			System.out.println(i);
//		}

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				int gugudan = i * j;
				System.out.println(i + " X " + j + " = " + gugudan);
			}

		}

	}
}
