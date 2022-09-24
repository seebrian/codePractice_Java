class Solution {
    public int findKthPositive(int[] arr, int k) {
        int left = 0;
        int right = arr.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            //System.out.printf("left: %d, right: %d, mid: %d, arr[mid] - 1 -mid: %d, k: %d%n", left,right,mid,arr[mid] - 1 -mid ,k);
            if (arr[mid] - 1 -mid >= k) {
                right = mid;
            } else if (arr[mid] - 1 -mid < k) {
                left = mid + 1;
            }
        }
        return left +k;
    }
}
