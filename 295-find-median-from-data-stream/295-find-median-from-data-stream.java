class MedianFinder {
    private List<Integer> nums;
    public MedianFinder() {
       nums = new ArrayList<Integer>();
    }
    public void addNum(int num) {
        int i = 0;
        for (; i < this.nums.size(); i++) {
            if (this.nums.get(i) >= num) {
                break;
            }
        }
        this.nums.add(i, num);
    }
    
    public double findMedian() {
        if (this.nums.size() % 2 == 1) {
            return this.nums.get(this.nums.size() / 2);
        } else {
            return (this.nums.get(this.nums.size() /2)+ this.nums.get(this.nums.size()/2-1))/2.0;
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
/*
class MedianFinder {
    private PriorityQueue<Integer> small = new PriorityQueue<>(Collections.reverseOrder());
    private PriorityQueue<Integer> large = new PriorityQueue<>();
    private boolean even = true;

    public double findMedian() {
        if (even)
            return (small.peek() + large.peek()) / 2.0;
        else
            return small.peek();
    }

    public void addNum(int num) {
        if (even) {
            large.offer(num);
            small.offer(large.poll());
            
             System.out.println("even:"+even);
             System.out.println("num:"+num);
            for (var e : small) {
                
            System.out.println("small.poll:"+e);
            }
           for(var l : large) {
                
            System.out.println("large.poll:"+l);
            }
        } else {
            small.offer(num);
            large.offer(small.poll());
            
            System.out.println("even:"+even);
            System.out.println("num:"+num);
            for(var e : small) {
                
            System.out.println("small.poll:"+e);
            }
            for(var l : large) {
                
            System.out.println("large.poll:"+l);
            }
        }
        even = !even;
    }
}
*/
