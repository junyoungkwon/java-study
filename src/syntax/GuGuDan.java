package syntax;

public class GuGuDan {
	
	public static void main(String[] args) {
		for(int j=9;j>0;j--) {
			for(int i=9;i>0;i--) {
				System.out.print(j + " X " + i + " = " + (j*i));
				if(i!=1) {
					System.out.print(", ");
				}
			}
			System.out.println();
		}
	}
}
/* 
 * 
 * for(int j=1;j<10;j++) {
 *	for(int i=1;i<10;i++) {
 * 		System.out.print(j + " X " + i + " = " + (j*i));
 *  if(i!=9) {
 *		System.out.print(",");
 *		}
 * 	} 
 * }
 */