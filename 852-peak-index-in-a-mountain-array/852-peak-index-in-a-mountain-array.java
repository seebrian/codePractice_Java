class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length;
        while (left < right) {
            int mid = left + (right-left) / 2;
            //System.out.println("left: "+left+", "+"right: "+right+", "+"mid: "+mid+", arr[mid]:" +arr[mid] +",res:" +res);
            if (arr[mid+1] > arr[mid]) {
                left = mid + 1;
            } else if (arr[mid+1] < arr[mid]) {
                right = mid;
            } 
        }
        return left;
    }
}