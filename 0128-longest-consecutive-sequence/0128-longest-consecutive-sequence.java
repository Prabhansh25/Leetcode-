class Solution {
    public int longestConsecutive(int[] nums) {   
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        
        int max = 1;
        int cnt = 1;      
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
               
                continue;
            } else if (nums[i] == nums[i - 1] + 1) {
             
                cnt++;
            } else {
               
                max = Math.max(max, cnt);
                cnt = 1;
            }
        }
        return Math.max(max,cnt) ;
    }
}