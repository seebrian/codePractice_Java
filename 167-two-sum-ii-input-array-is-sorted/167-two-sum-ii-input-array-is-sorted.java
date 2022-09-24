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