class Solution {

    boolean check(int[] weights, int days, int mid) {
        int n = weights.length;
        int daysUsed = 1;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            
            if(sum + weights[i] <= mid) {
                sum += weights[i];
            }
            else {
                daysUsed++;
                sum = weights[i];
            }
        }
        return daysUsed <= days;
    }

    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int low = 0;
        int high = 0;

        for(int i = 0; i < n; i++) {
            low = Math.max(low,weights[i]);
            high += weights[i];
        }
        int ans = -1;
        while(low <= high) {
            int mid = (low + high)/2;
            if (check(weights,days,mid)) {
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;

    }
}