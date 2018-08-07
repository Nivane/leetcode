class Solution {
    public boolean isValid(String s) {
        //边界情况和特殊情况
        if(s == null || s.length() == 0){
            return true;
        }else if(s.length() % 2 == 1){
            return false;
        }
        //存储对比字符
        Map<Character, Character> map = new HashMap<>();
        map.put('}','{');
        map.put(')','(');
        map.put(']','[');
        
        char[] symbols = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        
        for(int i = 0; i < symbols.length; i++){
            if(map.containsKey(symbols[i])){
                if(stack.size() > 0){
                    if(stack.peek() != map.get(symbols[i])){
                        return false;
                    }else{
                        stack.pop();
                    }
                }else{
                    return false;
                }
            }else{
                stack.push(symbols[i]);
            }
            
        }
        //pop到最后还不为空，则not valid
        if(stack.size() > 0){
            return false;
        }
        return true;
    }
}

// class Solution {
//     public boolean isValid(String s) 
//     {
//         String opening = "{([";
//         String closing = "})]";
        
//         Stack<Character> buffer = new Stack<Character>();
        
//         for(char c : s.toCharArray()) 
//         {
//             if(opening.indexOf(c) != -1)
//                 buffer.push(c);
//             else if(closing.indexOf(c) != -1)
//             {
//                 if(buffer.isEmpty()) 
//                     return false; 
//                 if(closing.indexOf(c) != opening.indexOf(buffer.pop()))
//                     return false;
//             }
//         }
//         return buffer.isEmpty();
//     }
// }