// class Solution {

// 	public int lengthOfLongestSubstring(String s) {

// 		if (s == null || s.length() == 0) {
// 			return 0;
// 		}

// 		int len = s.length();
// 		if (len == 1) {
// 			return 1;
// 		}

// 		int subLen = 0;
// 		StringBuilder sub = new StringBuilder();
// 		String[] strs = s.split("");

// 		for (int i = 0; i < len; i++) {
// 			if (sub.indexOf(strs[i]) == -1) {
// 				sub.append(strs[i]);
// 				if (sub.length() > subLen) {
// 					subLen = sub.length();
// 				}
// 			} else {
// 				sub = new StringBuilder(sub.substring(sub.indexOf(strs[i]) + 1)).append(strs[i]);
// 			}
// 		}

// 		return subLen;
// 	}
// }

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> foundChars = new HashMap<>();
        int max = 0;
        for ( int i = 0, j = 0; i < s.length(); i++ ) {
            if ( foundChars.containsKey(s.charAt(i)) ) {
                j = Math.max(j, foundChars.get(s.charAt(i)) + 1);
            }
            
            foundChars.put(s.charAt(i), i);
            max = Math.max(max, i - j + 1);
        }
        
        return max;
    }
}