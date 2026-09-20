class Solution {
    public int reverseDegree(String s) {
        int total = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
           total += (26 - (s.charAt(i) - 'a')) * (i + 1);
        }
        return total;
    }
}