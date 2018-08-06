class Solution {
   public int[] twoSum(int[] numbers, int target) {

		if (target < numbers[0]) {
			return null;
		}

		int low = 0;
		int high = numbers.length - 1;
		int[] res = new int[2];

		int sum;

		boolean flag = true;
		while (low < high && flag) {
			while ((sum = numbers[low] + numbers[high]) < target) {
				low++;
			}

			if (sum == target) {
				res[0] = low + 1;
				res[1] = high + 1;
				flag = false;
			} else if (sum > target) {
				high--;
			}
		}

		return res;
	}
}