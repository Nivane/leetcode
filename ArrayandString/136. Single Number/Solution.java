class Solution {
    public int singleNumber(int[] nums) {
        
        if(nums.length == 1){
            return nums[0];
        }
        
        //排序
        Arrays.sort(nums);
        int idx = 0;
        //如果一个数既不等于左侧，也不等于右侧，则这个数就是one
        for(int i = 0; i< nums.length; i++){
            
            if(i == 0){
                if(nums[i] != nums[i + 1]){
                     idx = i;
                }
            }else if(i == nums.length - 1){
                if(nums[i] != nums[i - 1]){
                    idx = i;
                }
            }else{
                if(nums[i] != nums[i - 1] && nums[i + 1] != nums[i]){
                    idx = i;
                }
            }
            
        }
        
        return nums[idx];
               
    }
}