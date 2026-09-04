class Solution {
    public int minimumDeletions(int[] nums) {
        int min = Integer.MAX_VALUE;
        int pos1 = 0;
        int pos2 = 0;
        int max = Integer.MIN_VALUE;
        int k = nums.length;
        for (int i = 0; i <= k - 1; i++) {
            if (nums[i] > max) {
                max = nums[i];
                pos2 = i;
            }
            if (nums[i] < min) {
                min = nums[i];
                pos1 = i;
            }
        }
        int left = Math.min(pos1, pos2);
        int right = Math.max(pos1, pos2);

        int deleteFront = right + 1;
        int deleteBack = k - left;
        int deleteBothEnds = (left + 1) + (k - right);

        return Math.min(deleteFront, Math.min(deleteBack, deleteBothEnds));
    }
}