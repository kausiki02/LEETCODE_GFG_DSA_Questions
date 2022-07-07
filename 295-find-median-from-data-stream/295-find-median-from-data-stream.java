class MedianFinder {
    
    // To store first half of data stream eg. 1, 2, 3, 6
    PriorityQueue<Integer> firstHalf;
    // To store second half of data stream eg. 8, 9, 11
    PriorityQueue<Integer> secondHalf;
    
    
    /** initialize your data structure here. */
    public MedianFinder() {
        
        firstHalf = new PriorityQueue<>((a,b) -> b - a); //maxheap : To fetch largest
        // element from first half in O(1) time
        secondHalf = new PriorityQueue<>(); //Min heap : To fetch lowest 
        // element from second half in O(1) time
    }
    
    public void addNum(int num) {
        // Insert in firstHalf if it's empty or if number being inserted is less than the peek of firstHalf otherwise insert in secondHalf
        if(firstHalf.isEmpty() || num<=firstHalf.peek()){
            firstHalf.add(num);
        }
        else{
            secondHalf.add(num);
        }
        
        // We also need to ensure that the halves are balanced i.e. there is no more than a difference of 1 in size of both halves
        // Let lowerHalf be the one to hold one extra element if the size of total data stream is odd otherwise be equal to upperHalf
        
        if(secondHalf.size()>firstHalf.size()){
            firstHalf.add(secondHalf.poll());
        }
        else if(firstHalf.size()>secondHalf.size()+1){
            // If an element added above, made firstHalf have 2 more elements then secondHalf then we put one into secondHalf from firstHalf
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