class Solution {
	public int pivotIndex(int[] nums) {

		// 先求总和
		int sum = 0;
		int lsum = 0;
        int rsum = 0;
		for (int i : nums) {
			sum += i;
		}

		// 假如当前是中心索引，求左侧和是否等于(sum-nums[i])
		for (int i = 0; i < nums.length; i++) {
            if(i != 0){
                lsum += nums[i-1];
            }
            rsum = sum - lsum - nums[i];
            if(lsum == rsum){
                return i;
            }
		}

		return -1;
	}
}