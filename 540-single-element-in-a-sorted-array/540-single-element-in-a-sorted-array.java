class Solution {
    public int singleNonDuplicate(int[] nums) {
        if (nums.length == 1) return nums[0];
        int left = 0;
        int right = nums.length - 1;
       
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mid % 2 == 1) mid--;
            if (nums[mid] == nums[mid+1]) {
                left = mid + 2;
            } else {
                right = mid;
            }
           
        }
        return nums[left];
    }
}

/*class Solution {
    public int singleNonDuplicate(int[] nums) {
        if (nums.length == 1) return nums[0];
        int left = 0;
        int right = nums.length - 1;
        int sum = nums[left] + nums[right];
        left++;right--;
        while (left < right) {
           
            int sumInner = nums[left] + nums[right];
            System.out.println(sum+", "+sumInner+","+left+","+right);
            
            if (sum == sumInner) {
                left++;
                right--;
                sum= nums[left] + nums[right];;
            } else if (nums[left] != nums[left+1]) {
                return nums[left];
            } else if (nums[right] != nums[right-1]) {
                return nums[right];
            }else{
                
            }
        }
        return nums[left];
    }
}*/