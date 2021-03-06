/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        
        int left = 1;
        int right = n;
        int mid = 0;
        int res;
        while(left <= right){
            mid = left + (right - left) / 2;
            res = guess(mid);
            if(res == 0){
                return mid;
            }else if(res == -1){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        
        return -1;
        
    }
}