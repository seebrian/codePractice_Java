class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int total = m + n - 1;
        int ptr1 = m - 1;
        int ptr2 = n -1;
        while (total >= 0) {
            //System.out.println(total+", "+ptr1+", "+ptr2);
            if (ptr1 < 0) {
                nums1[total--] = nums2[ptr2--];
            } else if (ptr2 < 0) {
                nums1[total--] = nums1[ptr1--];
            } else if (nums1[ptr1] >= nums2[ptr2]) {
                nums1[total--] = nums1[ptr1--];
            } else if (nums1[ptr1] < nums2[ptr2]) {
                nums1[total--] = nums2[ptr2--];
            }
        }
    }
}