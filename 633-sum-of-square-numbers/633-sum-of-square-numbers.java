class Solution {
    public boolean judgeSquareSum(int c) {
        if (c<=2) return true;
        int left = 0;
        long right = (long)Math.sqrt(c);
        
        while (left <= right) {
            
            long sum = left*left + right*right;
            //System.out.println(left+", "+right+", "+sum);
            if (sum > c) {
                right--;
            } else if (sum < c) {
                left++;
            } else {
                return true;
            }
        }
        return false;
    }
}