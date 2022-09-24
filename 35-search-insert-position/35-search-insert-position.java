class Solution {
    public int searchInsert(int[] nums, int target) {
    // Left closed, right open
        int left = 0 ;         
        int right = nums.length;
    
        while (left < right) {            
            int mid = left + (right-left)/2;  
            if (nums[mid] > target) {
                right = mid;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                return mid;
            }
        }
        return left;
    }
}

/*
// Left closed, right closed
class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = (left + right) /2;
            //System.out.println("left: "+left +", right: "+right+", mid: "+mid);
            
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return left;
    }
}
*/