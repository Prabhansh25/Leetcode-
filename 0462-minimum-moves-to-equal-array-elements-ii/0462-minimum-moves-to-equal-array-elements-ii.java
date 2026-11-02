class Solution {
    public int minMoves2(int[] nums) {
         Arrays.sort(nums) ;
        int mid = nums[nums.length/2] ;
        int moves = 0 ;
        int n = nums.length ;
        for(int i = 0 ; i < n ; i++){
            moves += Math.abs(nums[i]- mid) ;
        }
        return moves ;
    }
}