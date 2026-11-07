class Solution {
    public int maxArea(int[] nums) {
        int max = 0 ;
        int n = nums.length ;
        int j = n-1 ;
        int side = 0 ;
        int a = 0 ;
        int b = 0 ;
        int i = 0 ;
        while(i<j){
              a = Math.min(nums[i],nums[j]) ; 
              b = a*(j-i) ;
              max = Math.max(max,b) ;
              if(nums[i]>= nums[j]){
                j-- ;
              }
              else{
                i++ ;
              }
        }
        return max ;
    }
}