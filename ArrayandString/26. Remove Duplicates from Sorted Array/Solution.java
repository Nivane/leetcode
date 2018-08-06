class Solution {
	public int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}

		int k = 0;
		int cur = nums[0];
		nums[k] = nums[0]; 
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != cur) {
				k++;
				cur = nums[i];
				nums[k] = cur;
			}

		}

		return k + 1;

	}
}