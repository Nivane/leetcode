class Solution {
	public int dominantIndex(int[] nums) {
		int idx = 0;
        int max = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				idx = i;
                max = nums[i];
			}
		}

        int doublei = 0;
		for (int i = 0; i < nums.length; i++) {
            
            if(2 * nums[i] > max && i != idx){
                return -1;
            }
		}

		return idx;
	}
}