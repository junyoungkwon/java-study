package syntax;

public class Condition3 {
	
	public static void main(String[] args) {
		int num = 3;
		
		switch(num) {
		case 1 :
			System.out.println("1이네요~");
			break;
		case 2 :
			System.out.println("2이네요~");
			break;			
		case 3 :
			System.out.println("3이네요~");
			break; // break <= 결과 값이 True일 경우 나감.
		case 4 :
			System.out.println("4이네요~");
			break;
		default :
			System.out.println("1~4 아니네요");
			
		}
	}
}
