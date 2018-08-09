class Solution {
	public int uniqueMorseRepresentations(String[] words) {
		String[] morses = new String[] { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
				".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--",
				"--.." };

		Set<String> set = new HashSet<>();
		char[] chars;
		String res;
		for (int i = 0; i < words.length; i++) {
			res = "";
			chars = words[i].toCharArray();
			for (int j = 0; j < chars.length; j++) {
				res += morses[(int) (chars[j] - 97)];
			}
			set.add(res);
		}

		return set.size();
	}
}