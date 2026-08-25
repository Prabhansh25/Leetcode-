class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] % k == 0) {
                int c = nums[i] / k;
                int corrindex = c - 1;

                if (corrindex < n && nums[i] != nums[corrindex]) {
                    int temp = nums[i];
                    nums[i] = nums[corrindex];
                    nums[corrindex] = temp;
                } else {
                    break;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] != (i + 1) * k) {
                return (i + 1) * k;
            }
        }

        return (n + 1) * k;
    }

}
