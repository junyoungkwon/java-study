package exam.ex02;

public class StringArray2 {
	public String[] strs;
	
		
	public StringArray2() {
		strs = new String[10];
	}
		
	public static void main(String[] args) {
		//public String[] strs = new String[10];
		StringArray2 sa1 = new StringArray2();
		StringArray2 sa2 = new StringArray2();
		
		for (int i = 0; i < sa1.strs.length; i++) {
			sa1.strs[i] = (i+1) + ""; // String으로 만들어서 저장
			sa2.strs[i] = (10-i) + "";
		} 
		for (int i = 0; i < sa2.strs.length; i-- ) {
			System.out.println("sa1.strs[" + i + "]=" + sa1.strs[i]);
			System.out.println("sa2.strs[" + i + "]=" + sa2.strs[i]);
		}
	}
}
