class Solution {
    public int strStr(String haystack, String needle) {
        
        for (int left = 0; left < haystack.length()-needle.length()+1; left++) {
            for (int needleIndex=0; needleIndex < needle.length(); needleIndex++){ 
                if (haystack.charAt(left+needleIndex) != needle.charAt(needleIndex)) {
                    break;
                }
                if (needleIndex+1 == needle.length()){
                    return left;
                }
            }
        }
        return -1;
    }
}