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