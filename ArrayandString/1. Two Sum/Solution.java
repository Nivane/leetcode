class Solution {
public int[] twoSum(int[] nums, int target) {

		int[] nums1 = nums.clone();
        //先排序
		Arrays.sort(nums1);
        
        /**
        获取排序后的indices
        */
		int low = 0;
		int high = nums1.length - 1;
		int sum = 0;
		int[] res = new int[2];
		while (low < high) {
			while ((sum = nums1[low] + nums1[high]) > target) {
				high--;
			}

			if (sum == target) {
				res[0] = low;
				res[1] = high;
				break;
			} else {
				low++;
			}

		}
    
        //将排序后的indices对应为原来数组中的indices
		for (int i = 0; i < nums.length; i++) {
			if (nums1[low] == nums[i]) {
				res[0] = i;
			}
		}
    
    	for (int i = 0; i < nums.length; i++) {
			if (nums1[high] == nums[i] && i != res[0]) {
				res[1] = i;
			}
		}
        //如果倒序了，则交换顺序
        if(res[0] > res[1]){
            int tmp = res[0];
            res[0] = res[1];
            res[1] = tmp;
        }
        
		return res;

	}
}