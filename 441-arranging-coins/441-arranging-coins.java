class Solution {
    public int arrangeCoins(int n) {
        if (n == 1) return 1;
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right -left)/2;
            long sum = (long)(mid * ((1 +mid*1.0)/2));
            //System.out.printf("left: %d, right: %d, mid: %d, sum: %d%n", left,right,mid,sum);
            if (sum > n) {
                right = mid;
            } else
            if (sum <= n) {
                left = mid + 1;
            } 
        }
        return left-1;
    }
}