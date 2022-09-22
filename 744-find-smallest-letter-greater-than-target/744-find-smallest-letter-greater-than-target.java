class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;
        
        if (target >= letters[letters.length - 1])   target = letters[0];
        else    target++;
        while (left < right) {
            int mid = left + (right-left)/2;
            int targetNum = (int)letters[mid];
            //System.out.println("left: "+left+", "+"right: "+right+", "+"mid: "+mid+", TargetNum: "+targetNum+", "+letters[mid]);
            // if (targetNum == (int)'z')
            //     targetNum -=25;
            if ((int)letters[mid] > (int)target) {
                right = mid;
            }
            else if ((int)letters[mid] < (int)target) {
                left = mid + 1;
            }
            else {
                return letters[mid];
            }
        }
        return letters[left]; 
    }
}