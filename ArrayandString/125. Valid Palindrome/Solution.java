class Solution {
    public boolean isPalindrome(String s) {
        
        if(s == null){
            return false;
        }
        
        if(s.length() == 0 || s.length() == 1){
            return true;
        }
        
        char[] chars = s.toLowerCase().toCharArray();
        int left = 0;
        int right = chars.length - 1;
        //A man, a plan, a canal: Panama
        while(left < right){
            // System.out.println(chars[left] >= 48);
            // System.out.println(chars[left] <= 57);
            // System.out.println(chars[right]);
            while(!((chars[left] >= 97 && chars[left] <= 122) || (chars[left] >= 48 && chars[left] <= 57))){
                // System.out.println(1);
                left++;
                if(right < left){
                    return true;
                }
            }
            
            while(!((chars[right] >= 97 && chars[right] <= 122) || (chars[right] >= 48 && chars[right] <= 57))){
                // System.out.println(2);
                right--;
                if(right < left){
                    return true;
                }
            }
            if(chars[left] != chars[right])
                return false;
            left++;
            right--;
        }
        return true;
    }
}