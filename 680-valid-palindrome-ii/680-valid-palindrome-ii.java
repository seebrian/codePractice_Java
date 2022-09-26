class Solution {
    public boolean validPalindrome(String s) {
        
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
               return (isPalin(s, left+1, right) || isPalin(s, left, right-1));
                 
            } 
            left++;
            right--;
        }
        return true;
    }
    private boolean isPalin(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++; right--;
            }
            else return false;
        }
        return true;
    }
}