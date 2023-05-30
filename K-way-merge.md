# K Way Merge

if merge multiple sorted array/ linked list

Using Max Heap
```
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> Integer.compare(o2, o1));
        for (int r = 0; r < m; ++r) {
            for (int c = 0; c < n; ++c) {
                maxHeap.offer(matrix[r][c]);
                if (maxHeap.size() > k) maxHeap.poll();
            }
        }
        return maxHeap.poll();
```

Using Min Heap
arr =
[5, 8, 9, 17], 
[1, 6, 6, 6], 
[8, 17, 23, 24],

k = 6

for value = 6, when insert it, also need to add next element(6) to the heap for that array
```
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(o -> o[0]));
        for (int r = 0; r < Math.min(m, k); ++r)
            minHeap.offer(new int[]{matrix[r][0], r, 0});

        for (int i = 1; i <= k; ++i) {
            int[] top = minHeap.poll();
            int r = top[1], c = top[2];
            ans = top[0];
            if (c + 1 < n) minHeap.offer(new int[]{matrix[r][c + 1], r, c + 1});
        }
        return ans;
 
 ```
 ```
         PriorityQueue<int[]> kthSmallest = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        for (int index = 0; index < listLength; index++) {
            // if there are no elements in the input lists, continue
            if (lists.get(index).size() == 0) {
                continue;
            } else {
                // placing the first element of each list in the min-heap
                kthSmallest.offer(new int[] {lists.get(index).get(0), index, 0});
            }
        }

        // set a counter to match if our kth element
        // equals to that counter, return that number
        int numbersChecked = 0, smallestNumber = 0;
        while (!kthSmallest.isEmpty()) {  // iterating over the elements pushed in our min-heap
            // get the smallest number from top of heap and its corresponding list and index
            int[] smallest = kthSmallest.poll();
            smallestNumber = smallest[0];
            int listIndex = smallest[1];
            int numIndex = smallest[2];
            numbersChecked++;

            if (numbersChecked == k) {
                break;
            }

            // if there are more elements in list of the top element,
            // add the next element of that list to the min-heap
            if (numIndex + 1 < lists.get(smallest[1]).size()) {
                kthSmallest.offer(new int[] {lists.get(listIndex).get(numIndex + 1), listIndex, numIndex + 1});
            }
        }
 ```
