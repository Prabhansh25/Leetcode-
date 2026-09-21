class Solution {
    public int[] asteroidCollision(int[] nums) {
        Stack<Integer> st = new Stack<>() ;
        int n = nums.length ;

        for(int i  =0 ; i< n ; i++){
            if(nums[i]>0){
                st.push(nums[i]) ;
            }
            else{
                while(!st.empty() && st.peek() >0 && st.peek() < Math.abs(nums[i])){
                    st.pop() ;
                }
                if(!st.empty() && st.peek() == Math.abs(nums[i])){
                    st.pop() ;
                }
                else if ( st.empty() || st.peek() <0 ){
                    st.push(nums[i]);
                }

                }
            }
            int[] result = new int[st.size()];
            for (int i = result.length - 1; i >= 0; i--) {
            result[i] = st.pop();
        }
        return result ;
        }
        
    }
