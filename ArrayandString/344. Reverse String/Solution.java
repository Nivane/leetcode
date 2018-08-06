class Solution {
    public String reverseString(String s) {
        char[] chars = s.toCharArray();
        char tmp;
        int len = chars.length;
        for(int i = 0; i < len / 2; i++){
            tmp = chars[len - i - 1];
            chars[len - i - 1] = chars[i];
            chars[i] = tmp;
        }
        
        return String.valueOf(chars);
    }
}