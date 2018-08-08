/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        if(n <= 0){
            return -1;
        }
        
        if(isBadVersion(1)){
            return 1;
        }
        
        int left = 1;
        int right = n;
        
        int mid = 0;
        
        while(left < right){
            // mid = left + (right - left) / 2;
            // if(isBadVersion(mid + 1) && (!isBadVersion(mid))){
            //     return mid + 1;
            // }else if(isBadVersion(mid)){
            //     right = mid - 1;
            // }else if(!isBadVersion(mid)){
            //     left = mid + 1;
            // }
            
            mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        
        return left;
    }
}