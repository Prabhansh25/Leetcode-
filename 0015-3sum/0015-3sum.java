
public class Solution {

    public List<List<Integer>> threeSum(int[] num) {

        int n = num.length;

        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(num);

        for (int i = 0; i < n; i++) {

            if (i > 0 && num[i] == num[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int sum = num[i] + num[j] + num[k];

                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {

                    List<Integer> temp = Arrays.asList(num[i], num[j], num[k]);
                    ans.add(temp);

                    j++;
                    k--;

                    while (j < k && num[j] == num[j - 1]) {
                        j++;
                    }

                    while (j < k && num[k] == num[k + 1]) {
                        k--;
                    }
                }
            }
        }

        return ans;
    }
}