class Solution {
    public int reverse(int x) {
        //Solution1:使用StringBuilder反复判断
//         String s = String.valueOf(x);
        
//         if(s.length() == 1){
//             return Integer.parseInt(s);
//         }
        
//         StringBuilder str = new StringBuilder(s);
//         while(str.charAt(str.length() - 1) == '0'){
//             str.deleteCharAt(str.length() - 1);
//         }
        
//         if(str.charAt(0) == '-'){
//             // str = str.insert(0, '-');
//             str.deleteCharAt(0);
//             str = str.append('-');
//         }
//         try{
//             int res = Integer.parseInt(str.reverse().toString());
//             return res;
//         }catch(Exception e){
//             return 0;
//         }   
        
        //Solution2: 当作数字处理
        
        long sum = 0;
        
        while(x != 0){
            sum = sum * 10 + x % 10;
            x = x / 10;
        }
        
        if(sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE){
            return 0;
        }
        
        return (int) sum;
        
        
    }
}