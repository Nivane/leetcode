class Solution {
    public String toLowerCase(String str) {
        // return str.toLowerCase();
        
        //ASCII码转换
        char[] chars = str.toCharArray();
        for(int i = 0; i < chars.length; i++){
            if(chars[i] >= 65 && chars[i] <= 90){
                chars[i] = (char)(chars[i] + 32);
            }
        }
        
        return String.valueOf(chars);
        
        
        
    }
}