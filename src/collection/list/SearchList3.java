package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchList3 {
	public static void main(String[] args) {

		ArrayList<Integer> numList = new ArrayList<>();
		for (int i = 0; i < 6; i++) {
			numList.add((int) (Math.random() * 45) + 1);
		}
		Scanner scan = new Scanner(System.in);
		String[] numStr = scan.nextLine().split(",");
		int cnt = 0;
		for(String str : numStr) {
			if(numList.indexOf(Integer.parseInt(str))!=-1) {
				cnt++;
			}
		}
		System.out.println("numList: " + numList);
		System.out.println("맞춘 갯수는: " + cnt);
		scan.close();
		
	}
}
