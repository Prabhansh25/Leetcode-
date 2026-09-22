class Solution {
    public int sumSubarrayMins(int[] arr) {
        int[] nse = findNSE(arr);
        int[] psee = findPSEE(arr);
        int total = 0;
        int mod = (int) (1e9 + 7);
        for (int i = 0; i < arr.length; i++) {
            int left = i - psee[i];
            int right = nse[i] - i;
            long ways = (long) left * right;
            long contribution = (ways * arr[i]) % mod;

            total = (int) ((total + contribution) % mod);
        }
        return total;
    }

    private int[] findPSEE(int[] arr) {
        int n = arr.length ;
        int[] psee = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            psee[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return psee;
    }

    private int[] findNSE(int[] arr) {
        int n = arr.length ;
        int[] nse = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return nse;
    }
}