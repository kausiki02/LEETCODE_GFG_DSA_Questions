class MedianFinder {
    
    PriorityQueue<Integer> firstHalf;
    PriorityQueue<Integer> secondHalf;
    
    public MedianFinder() {
        firstHalf = new PriorityQueue<>((a,b) -> b - a); //maxheap
        secondHalf = new PriorityQueue<>(); //min heap
    }
    
    public void addNum(int num) {
        if(firstHalf.isEmpty() || num<=firstHalf.peek()){
            firstHalf.add(num);
        }
        else{
            secondHalf.add(num);
        }
        
        if(secondHalf.size()>firstHalf.size()){
            firstHalf.add(secondHalf.poll());
        }
        else if(firstHalf.size()>secondHalf.size()+1){
            secondHalf.add(firstHalf.poll());
        }
        
    }
    
    public double findMedian() {
        if(firstHalf.size()==secondHalf.size()){
            return (double)(firstHalf.peek()+secondHalf.peek())/2;
        }
        else{
            return (double)(firstHalf.peek());
        } 
    }
} 


/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */