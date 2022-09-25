class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = weights[0];
        int right = 0;
        for (int weight: weights) {
            left = Math.max(left, weight);
            right += weight;
        }
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isPossible(days, mid, weights)) {
                right = mid;
            } else {
                left = mid +1;
            }
        }
        return left;
    }
    public boolean isPossible(int days, int mid, int[] weights) {
        int total = 0;
        int count = 1;
        for (int weight: weights) {
            total += weight;
            if (total > mid) {
                count++;
                total = weight;
                if (count > days) {
                    return false;
                }
            }
        }
        return true;
    }
}