​Basic Binary Search
Leetcode #704

Note:
mid = (low + high) / 2 ..if low and high are very big,this line will cause overflow errror...

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

Leetcode #35
if arr[mid] > target, right = mid-1, left would remain unchanged --> (correct Insert position)
if arr[mid] < target, left = mid+1, no change for left --> (correct Insert position)
