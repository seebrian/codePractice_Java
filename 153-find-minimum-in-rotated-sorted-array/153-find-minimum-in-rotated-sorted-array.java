class Solution {
    public int findMin(int[] nums) {
        if (nums.length == 1) return nums[0];
        int left = 0;
        int right = nums.length - 1;
        int smallest = Integer.MAX_VALUE;
        while (left <= right) {
            int mid = left + (right-left) /2;
            
            if(nums[mid] >= nums[left]){
                smallest = Math.min(nums[left],smallest);
                left = mid+1;
            }else{
                smallest = Math.min(nums[mid],smallest);
                right = mid - 1;
            }
        }
    return smallest;
    }
}