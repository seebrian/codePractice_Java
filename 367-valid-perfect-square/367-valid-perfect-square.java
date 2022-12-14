class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 1) return true;
        int left = 1; 
        int right = num;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mid > num*1.0 / mid) {
                right = mid;            
            } else if (mid < num*1.0/mid){
                left = left + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}

/*
class Solution {
    public boolean isPerfectSquare(int num) {
        //Left Closed - Right Closed
        if (num == 1) return true;
        int left = 0;
        int right = num / 2;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            //System.out.println(left +", "+right+", "+mid);
            if (mid > num*1.0 / mid) {
                right = mid - 1;
            }
            else if (mid < num*1.0 / mid) {
                left = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
*/