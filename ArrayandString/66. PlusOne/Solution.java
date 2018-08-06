class Solution {

	public int[] plusOne(int[] digits) {
		int len = digits.length;
		//最后一位不是9
		if (digits[len - 1] != 9) {
			digits[len - 1] = digits[len - 1] + 1;
			return digits;
		} else {
            
			int nine = checkNine(digits);
			if (nine == -1) {
                //所有位都是9
				int[] d1 = new int[len + 1];
				d1[0] = 1;
				return d1;
			} else {
                //最右侧不是9的位+1，右侧全为0
				for (int i = nine + 1; i < len; i++) {
					digits[i] = 0;
				}
				digits[nine] = digits[nine] + 1;
				return digits;
			}

		}

	}

	public static int checkNine(int[] digits) {

		int len = digits.length;
		for (int i = len - 1; i >= 0; i--) {
			if (digits[i] != 9) {
				return i; // 存在不为9的数,索引为i
			}
		}

		return -1;
	}
}