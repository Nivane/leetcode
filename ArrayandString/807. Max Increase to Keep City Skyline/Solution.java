class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        if(grid == null || grid.length < 1 || grid[0].length < 1){
            return -1;
        }
        
        
        int[] max1 = new int[grid.length];
        for(int i = 0; i < grid.length; i++){
            max1[i] = getMax1(grid[i]); //8 7 9 3
        }
        
        int[] max2 = getMax2(grid);
        
        int sum = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                sum += Math.min(max1[i], max2[j]) - grid[i][j];
            }
        }
        
        return sum;
        
    }
    
    public int getMax1(int[] nums){
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > res){
                res = nums[i];
            }
        }
        return res;
    }
    
    public int[] getMax2(int[][] grid){
        int[] max = new int[grid[0].length];
        int res;
        for(int i = 0; i < grid[0].length; i++){
            res = 0;
            for(int  j = 0; j < grid.length; j++){
                if(grid[j][i] > res){
                    res = grid[j][i];
                }
            }
            max[i] = res;
        }
        return max;
        
    }
    
    
}