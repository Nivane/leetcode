class Solution {
    public boolean isAnagram(String s, String t) {
        //太慢了
//         if(s == null || t == null){
//             return false;
//         }
        
//         if(s.equals("") && t.equals("")){
//             return true;
//         }
        
//         if(s.length() != t.length()){
//             return false;
//         }
        
//         List<String> list = new ArrayList<String>(Arrays.asList(s.split("")));
//         for(int i = 0; i < t.length(); i++){
//             if(!list.remove(String.valueOf(t.charAt(i)))){
//                 return false;
//             }
//         }
        
//         if(list.size() == 0){
//             return true;
//         }
        
//         return false;
        
        if(s == null || t == null){
            return false;
        }
        
        if(s.length() != t.length()){
            return false;
        }
        
        int[] array1 = new int[26];
        int[] array2 = new int[26];
        
        for(int i = 0; i < s.length(); i++){
            array1[s.charAt(i) - 'a']++;
        }
        
        for(int j = 0; j < t.length(); j++){
            array2[t.charAt(j) - 'a']++;
        }
        
        return Arrays.equals(array1, array2);
        
    }
}