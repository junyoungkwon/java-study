package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class Baseball1 {

	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			int ranNum = (int) (Math.random() * 9 + 1);
			if (numList.indexOf(ranNum) == -1) {
				numList.add(ranNum);
			} else {
				i--;
			}
		}

		int sCnt = 0;
		int bCnt = 0;

//		System.out.println("numList : " + numList);

		Scanner scan = new Scanner(System.in);

		while (sCnt != 3) {
			sCnt = 0;
			bCnt = 0;
			System.out.println("번호 입력 : ");
			String[] numStr = scan.nextLine().split(",");
			int[] nums = new int[3];
			for (int i = 0; i < numStr.length; i++) {
				nums[i] = Integer.parseInt(numStr[i]);
			}
			for (int i = 0; i < nums.length; i++) {
				if (numList.indexOf(nums[i]) != -1) {
					if (i == numList.indexOf(nums[i])) {
						sCnt++;
					} else {
						bCnt++;
					}
				}
			}
			if (sCnt + bCnt == 0) {
				System.out.println("Out!");
			} else {
				System.out.println(sCnt + "S" + " " + bCnt + "B");
			}
		}
	}
}
