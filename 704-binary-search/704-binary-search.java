class Solution {
    public int search(int[] nums, int target) {
        // Left closed and right open interval
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                right = mid;
            } else if (nums[mid] < target) {
                left = mid +1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
/*
// Left closed and right closed interval
class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        
        while (left < right) {
            int mid = (left + right) / 2;
            System.out.println("left: "+left +", right: "+right+", mid: "+mid);
            if (nums[mid] > target) {
                right = mid;
            } else  if (nums[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
*/