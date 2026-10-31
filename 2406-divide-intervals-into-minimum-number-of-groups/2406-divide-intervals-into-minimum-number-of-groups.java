public class Solution {
    public int minGroups(int[][] intervals) {
        int n = intervals.length;
        int[] starts = new int[n];
        int[] ends = new int[n];

        for (int i = 0; i < n; i++) {
            starts[i] = intervals[i][0];
            ends[i] = intervals[i][1];
        }

        Arrays.sort(starts);
        Arrays.sort(ends);

        int endPtr = 0;
        int maxGroups = 0;

        for (int start : starts) {
            if (start > ends[endPtr]) {
                endPtr++;
            } else {
                maxGroups++;
            }
        }

        return maxGroups;
    }
}