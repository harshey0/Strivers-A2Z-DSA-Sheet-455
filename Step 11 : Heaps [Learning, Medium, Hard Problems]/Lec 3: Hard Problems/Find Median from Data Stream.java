class MedianFinder {

    PriorityQueue <Integer>min;
    PriorityQueue <Integer>max;
    public MedianFinder() {
        min = new PriorityQueue();
        max = new PriorityQueue(Collections.reverseOrder());
    }
    
    public void addNum(int num) {
       
        if((max.size()+min.size())%2==0)
        {min.add(num);
        max.add(min.remove());}
        else
        {  max.add(num);
            min.add(max.remove());
        }
    }
    
    public double findMedian() {
       
           if((max.size()+min.size())%2==1)
            return max.peek();
            else
            return (double)(max.peek()+min.peek())/2.0;

     
    }
}