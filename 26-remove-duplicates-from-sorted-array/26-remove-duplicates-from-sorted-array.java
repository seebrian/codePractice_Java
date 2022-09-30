class Solution {
    public int removeDuplicates(int[] nums) {
        int slow = 0;
        int count =1;
        for (int fast =0; fast < nums.length; fast++) {
            if (nums[slow] != nums[fast]) {
                nums[slow+1] = nums[fast];
                slow++;
                count++;
            }
        }
        return count;
    }
}