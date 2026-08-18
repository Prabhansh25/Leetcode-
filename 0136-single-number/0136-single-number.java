class Solution {
    public int singleNumber(int[] nums) {
        int zor= 0 ;
        for(int i = 0 ; i <= nums.length-1 ; i++){
            zor = zor^ nums[i] ;
        }
        return zor ;
    }
}