class Solution {
    public int[] searchRange(int[] nums, int target) {
        //Left Closed - Right Open
        int left = 0; 
        int right = nums.length;
        int first = -1;
        int last = -1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                right = mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            }  else {
                first = mid;
                right = mid ;
            }
        }
        left = first;
        if (left != -1) {
            right = nums.length;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] > target) {
                    right = mid;
                } else if (nums[mid] < target) {
                    left = mid + 1;
                }  else {
                    last = mid;
                    left = mid + 1;
                }
            }
        }
        int[] result = {first, last};
        return result;
    }
}
/*
//Left Closed - Right Closed
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0; 
        int right = nums.length - 1;
        int first = -1;
        int last = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                right = mid -1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                first = mid;
                right = mid -1;
            }
        }
        left = first;
        if (left != -1) {
            right = nums.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] > target) {
                    right = mid -1;
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    last = mid;
                    left = mid + 1;
                }
            }
        }
        int[] result = {first, last};
        return result;
    }
}*/