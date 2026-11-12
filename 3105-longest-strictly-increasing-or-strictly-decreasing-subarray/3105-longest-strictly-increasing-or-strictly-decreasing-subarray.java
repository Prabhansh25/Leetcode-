class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int cnt = 1 ;
        int n = nums.length ;
        int a = 1 ;
        int b = 1 ;
        for(int i = 0 ; i < n-1 ; i++){
           
            if(nums[i]> nums[i+1]){
                a++ ;
                b = 1 ;
                cnt = Math.max(a,cnt) ;
            }
            else if (nums[i] < nums[i+1]){
               b++;
                a = 1;
                cnt = Math.max(b,cnt);
            }
            else{
               a =1 ;
        b=1 ;
            }
        }
        return cnt ;
    }
}