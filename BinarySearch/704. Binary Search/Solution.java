class Solution {
    public int search(int[] nums, int target) {
        
         if(nums == null || nums.length == 0){
            return -1;
        }
        
        return binarySearch(nums, 0, nums.length - 1, target);
    }
    
    
    public int binarySearch(int[] nums, int left, int right, int target){
       if(left > right){
           return -1;
       }
        
        int mid = (right + left) / 2;
        if(nums[mid] == target){
            return mid;
        }else if(nums[mid] > target){
            return binarySearch(nums, left, mid - 1, target);
        }else{
            return binarySearch(nums, mid + 1, right, target);
        }
    }
}