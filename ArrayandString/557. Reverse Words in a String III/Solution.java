class Solution {
    public String reverseWords(String s) {
        
        if(s == "" || s == null || s.length() == 0){
            return "";
        }
        
        
        StringBuilder sb = new StringBuilder(s);
        s = sb.reverse().toString();
        
        String[] strs = s.split(" ");
        int len = strs.length;
        StringBuilder res = new StringBuilder("");
        for(int i = len - 1; i >= 0; i--){
            res.append(strs[i] + " ");
        }
        
        return res.toString().substring(0, res.length() -1);
        
    }
    
    
}