class KadanesAlgo {


    int maxSubarraySum(int[] arr) {
        int ans = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max + arr[i], arr[i]);
            ans = Math.max(ans, max);
        }
        return ans;
    }
}