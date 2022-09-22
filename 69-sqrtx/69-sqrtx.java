class Solution {
    public int mySqrt(int x) {
        // Left closed, right open
        if (x == 0 || x == 1) return x;
        int left = 1;
        int right = x/2 + 2;
        
        while (left < right) {
            int mid = left + (right - left) / 2; 
            if (mid > x/mid) {
                right = mid;
            }
            else if (mid < x/mid) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return left - 1;
    }
}

/*
// Left closed, right closed
class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        int left = 0;
        int right = x/2+1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid > x/mid) {
                right = mid -1;
            }
            else if (mid < x/mid) {
                left = mid + 1;
                if (left > x/left) {
                    return mid;
                }
            }
            else { 
                return mid;
            }
        }
        return left;
    }
}
*/