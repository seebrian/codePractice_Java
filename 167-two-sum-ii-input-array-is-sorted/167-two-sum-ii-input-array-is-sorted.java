class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //Two pointers
        int left = 0;
        int right = numbers.length-1;
        int[] result = new int[2];
        while (left < right) {
            int total = numbers[left] + numbers[right];
            if (total == target) {
                result[0] = left + 1;
                result[1] = right + 1; 
                return result;
            } else if (total > target) {
                right--;
            } else {
                left++;
            }
        }
        return result;
    }
}
/*
//binary search
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i< numbers.length; i++) {
            int left = i;
            int right = numbers.length;
            while (left < right) {
                int mid = left + (right - left) / 2;
                int number = target - numbers[i];
                if (numbers[mid] > number) {
                    right = mid;
                }
                else if (numbers[mid] < number) {
                    left = mid + 1;
                }
                else {
                    int[] result = {i+1, mid+1};
                    return result;
                }
            }
        }
        return null;
    }
}
*/