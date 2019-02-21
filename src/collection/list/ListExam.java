package collection.list;

import java.util.ArrayList;

public class ListExam {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>(); // 자동으로 구성원의 DataType은 Object, <Data Type> 이렇게 되면 이 데이터 타입만 입력 가능 
//		al.add(10);
//		al.add(20);
		al.add("abc");
//		al.add(1.2);
//		al.add('c');
//		al.add(true); 
		
		System.out.println(al.size());
		al.remove(0);
		System.out.println(al.size());
		
		ArrayList<Integer> numList = new ArrayList<>(); // <> 안에는 정해져 있는 데이터 타입을 사용할 수 없다.
		numList.add(1);
		
	}
}
