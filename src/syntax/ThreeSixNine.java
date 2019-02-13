package syntax;

public class ThreeSixNine {

	public static void main(String[] args) {
		for (int i = 1; i < 30; i++) {
			if (i < 10 && i % 3 == 0) {
				System.out.println("짝");
			} else if (i > 10 && i % 3 == 1) {
				System.out.println("짝");
			} else
				System.out.println(i);
		}
	}
}


/* 
 * package syntax;
 * 
 * public class ThreeSixNine {
 * 
 * public static void main(String[] args) {
 *	for(int i =1;i<30;i++) {
 *		int mod = i % 10;
 *		if(mod==3 || mod==6 || mod==9) {
 *			System.out.println("짝");
 *		}else {
 *			System.out.println(i);
 *		}
 *		}
 *	}
 *} 
 */
 
