package collection.list;

import java.util.ArrayList;

public class ListExam2 {

	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			numList.add(i);
		}
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(numList.get(i-1));
//		}

		for (int i = 100; i > 0; i--) {
			if (i % 10 == 0) {
				numList.add(i);
			}
		}

	}
}
