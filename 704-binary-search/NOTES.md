​Basic Binary Search
Leetcode #704

Note:
mid = (left + right) / 2 <br>
if left and right are very big,this line will cause overflow errror...
Suppose your 'left' and 'right' are 16 bit unsigned integers. That means, they can only have a maximum value of 2^16=65536. Consider this, left = 65530 right = 65531 <br>
if we added them first, (left+right) would end up being junk since that big a number (131061) cannot be stored in a your 16-bit integer. And so, mid would be a wrong value.

(left+right)/2 <br>
= (left+right)/2 + left/2  - left/2 <br>
= left/2 + left/2 + right/2 - left/2<br>
= left + (right-left)/2

Range:<br>
1. Range: [left, right]
- while loop condition: if (left<=right), because right is inclusive 
- if ( arr[mid] > target) right = mid - 1, because -1 ensure program did not search before
- if ( target < arr[mid]) left = mid + 1, because +1 ensure program did not search before
- right = arr size -1, because start from 0 index to arr size -1 index

2. Range: [left, right)
- while loop condition: if (left<ight), because right is not inclusive 
- if ( arr[mid] > target) right = mid , because +1 ensure program did not search before
- if ( target < arr[mid]) left = mid + 1, because +1 ensure program did not search before
- right = arr size

Leetcode #34 <br>
if (nums[mid] == target) right = mid - 1;		// Look for better answer to the left, find the first answer <br>
if (nums[mid] == target) left = mid + 1;		// Look for better answer to the right, find the last answer <br>

Leetcode #69 <br>
mid * mid > x can overflow. replace by mid > x / mid<br>
`left` is the minimum k value, `left - 1` is the answer

Leecode #278, #367, #374, #69<br>
start with 1 to n <br>
Leetcode #441 <br>
if left = mid +1, if equal target than look to the right <br>
left` is the minimum k value, `left - 1` is the answer

leetcode #1539
need handle equal case <br>
if (arr[mid] - 1 -mid >= k) {<br>
                right = mid;

leetcode #167 two pointers & binary search
