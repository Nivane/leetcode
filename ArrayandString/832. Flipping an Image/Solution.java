class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int i = 0; i < A.length; i++){
            reverse(A[i]);
        }
        return A;
    }
    
    public int[] reverse(int[] nums){
        int len = nums.length / 2;
        int numLen = nums.length;
        int tmp = 0;
        for(int i = 0; i < len; i++){
            tmp = invert(nums[i]);
            nums[i] = invert(nums[numLen - i - 1] );
            nums[numLen -i - 1] = tmp;
        }
        if(nums.length % 2 == 1){
            nums[len] = invert(nums[len]);
        }
        return nums;
    }
    
    public int invert(int num){
       return (num == 1) ? 0 : 1;
    }
}