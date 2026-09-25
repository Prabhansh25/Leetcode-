class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length ;
        int k = n*(n+1)/2 ;
        int p = 0 ;
        for(int i = 0 ; i <n ; i++){
            p += nums[i] ;
        }
        return k-p ;
    }
}