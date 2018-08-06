class Solution {
	public int firstUniqChar(String s) {

		char[] chars = s.toCharArray();

		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < chars.length; i++) {
			if (map.containsKey(chars[i])) {
				map.put(chars[i], -1);
			} else {
				map.put(chars[i], i);
			}
		}

		int idx = -1;
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {

			if (entry.getValue() != -1) {
				if (idx == -1) {
					idx = entry.getValue();
				}

				if (entry.getValue() < idx) {
					idx = entry.getValue();
				}

			}
		}
		return idx;
	}
}