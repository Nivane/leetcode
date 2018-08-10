class Solution {
    public int mySqrt(int x) {
        if(x < 0){
            return -1;
        }
        if(x == 0 || x == 1){
            return x;
        }
        int left = 0;
        int right = x;
        while(left <= right){
            int mid = left + (right - left) / 2;
            int res = isSqrt(mid, x);
            if(res == 0){
                return mid;
            }else if(res == 1){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        
        return -1;
    }
    
    
    private int isSqrt(long num, int x){
        if(num * num <= x && (num * num + num * 2 + 1) > x){//int有溢出的风险
            return 0;
        }else if(num * num > x){
            return 1;
        }else{
            return -1;
        }
    }
}