class Solution {
    public int strStr(String haystack, String needle) {
        for (int hIndex = 0; hIndex < haystack.length()-needle.length()+1; hIndex++) {
            for (int nIndex=0; nIndex < needle.length(); nIndex++){ 
                if (haystack.charAt(hIndex+nIndex) != needle.charAt(nIndex)) {
                    break;
                }
                if (nIndex+1 == needle.length()){
                    return hIndex;
                }
            }
        }
        return -1;
    }
}