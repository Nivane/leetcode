class Solution {
    public int numJewelsInStones(String J, String S) {
//         int count = 0;
        
//         Set<String> set = new HashSet<>(Arrays.asList(J.split("")));
//         String[] stones = S.split("");
//         int len = stones.length;
//         for(int i = 0; i < len; i++){
//             if(set.contains(stones[i])){
//                 count++;
//             }
//         }
        
//         return count;
        
        int count = 0;
        int len = S.length();
        for(int i = 0; i < len; i++){
            if(J.indexOf(S.charAt(i)) != -1){
                count++;
            }
        }
        
        return count;
    }
}