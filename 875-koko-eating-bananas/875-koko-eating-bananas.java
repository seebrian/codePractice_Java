class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        
        for (int pile : piles) {
            right = Math.max(right, pile);
        }
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isPossible(mid, h, piles)) {
                right = mid;    
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    
    public boolean isPossible(int mid, int h, int[] piles) {
        int count = 0;
        for (int pile : piles) {
            count += pile / mid ;
            if (pile % mid != 0) {
                count++;
            }
        }
        if (count > h) {
            return false;
        }
        return true;
    }
}