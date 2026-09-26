class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;
        
        int current = 2;
        int pre = 1;
        
        for (int i = 3; i <= n; i++) {
            int temp = current;
            current = current + pre;
            pre = temp;
        }
        
        return current;
    }
}