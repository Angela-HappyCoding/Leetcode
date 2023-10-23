class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n = difficulty.length;
        int[][] pair = new int[n][2];

        for (int i = 0; i < n; i++) {
            pair[i] = new int[]{difficulty[i], profit[i]};
        }
        Arrays.sort(pair, (a, b) -> (a[0] - b[0]));

        int best = 0;
        for (int i = 0; i < n; i++){
            best= Math.max(best, pair[i][1]);
            pair[i][1] = best;
        }

        Arrays.sort(worker);

        int i = n - 1;
        int res = 0;
        for (int j = worker.length - 1; j >= 0; j--) {
            while (i >= 0 && worker[j] < pair[i][0]) {
                i--;
            }
            if (i < 0) break;
            res += pair[i][1];
        }
        return res;
    }
}