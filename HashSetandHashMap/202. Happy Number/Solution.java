class Solution {
	public boolean isHappy(int n) {

		Set<Integer> set = new HashSet<>();
		int sum = 0;
		while (n != 1) {
			sum = 0;
			set.add(n);
			while (n != 0) {
				sum += (n % 10) * (n % 10);
				n = n / 10;
			}

			n = sum;
			if (n == 1) {
				return true;
			} else if (set.contains(sum)) {
				return false;
			}

		}

		return true;
	}
}