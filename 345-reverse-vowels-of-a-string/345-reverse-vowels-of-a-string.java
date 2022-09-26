class Solution {
    public String reverseVowels(String s) {
        String vowerls = "aeiouAEIOU";
        
        int left = 0;
        int right = s.length() - 1;
        char[] arr = s.toCharArray();
        while (left < right) {
            
            while (left < right) {
                
                if (!vowerls.contains(arr[left]+"")) {
                    left++;
                } else break;
            }
            
            while (left < right) {
                if (!vowerls.contains(arr[right]+"")) {
                    right--; 
                } else break;
            }
            
            if (vowerls.contains(arr[left]+"") &&  vowerls.contains(arr[right]+""))             {
                char tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
                
            }
            left++; right--;
        }
        return new String(arr);
    }
}