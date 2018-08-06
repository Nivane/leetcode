class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }
     
        int len = strs.length;
        String prefix = strs[0];
        
        for(int i = 0; i < len; i++){//根据上一次迭代出的结果作为前缀，继续下个迭代
            while(strs[i].indexOf(prefix) != 0){
                if(prefix.length() > 0){
                    prefix = prefix.substring(0, prefix.length() -1);
                }else{
                    return "";
                }
                
            }
        }
        
        return prefix;
    }
}