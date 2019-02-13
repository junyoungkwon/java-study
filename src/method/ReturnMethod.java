package method;

public class ReturnMethod {

	static int indexOf(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				return i;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		int[] nums = new int[3];
		nums[0] = 7;
		nums[1] = 4;
		nums[2] = 1;
		int idx = indexOf(nums,4);
		System.out.println("4의 위치는 : " + idx);
	}

}
