class Solution {
    public int splitArray(int[] nums, int m) {
        int left = nums[0];
        int right = 0;
        
        for (int num : nums) {
            left = Math.max(left, num);
            right += num;
        }
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isPossible(mid, m, nums)) {
                right = mid;
            }
            else 
                left = left+1;
        }
        return left;
    }
    
    public boolean isPossible (int mid, int m, int[] nums) {
        int total = 0;
        int count = 1;
        
        for (int num: nums) {
            total += num;
            if (total > mid) {
                count++;
                total = num;
                if (count > m) {
                    return false;
                }
            }
        }
        return true;
    }
}