package data;

public class DataCasting {

	
	public static void main(String[] args) {
		Byte b = new Byte((byte) 10);		// byte
		Short s = new Short((short)10); 	// short
		Integer i = new Integer(10);		// int **Interger.parseInt
		Long l = new Long(10);				// long
		
		Float f = new Float(1.2f);
		Double d = new Double(1.2);
		
		Character c = new Character('c');
		Boolean bl = new Boolean(true);
		String numStr = "123.5";
		d = Double.parseDouble(numStr);
		int num = d.intValue();
		System.out.println(num+1);
		double db = Double.parseDouble(numStr);
		System.out.println(db+1);
	
	
	
	
//	public static void main(String[] args) {
//		int num = 1;
//		Integer i = num;				// int처럼 사용 가능하지만 Datatype은 Integer
//		String str = i.toString();		// num + ""; 이렇게 하지 않아도 String으로 변환
		
	}

}
