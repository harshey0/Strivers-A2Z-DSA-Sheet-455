class MyQueue {
    Stack <Integer> s1;
    Stack <Integer> s2;
    
        public MyQueue() {
            s1 = new Stack();
            s2 = new Stack();
        }
        
        public void push(int x) {
            while(!s2.isEmpty())
            s1.push(s2.pop());
            s1.push(x);
            while(!s1.isEmpty())
            s2.push(s1.pop());
        }
        
        public int pop() {
            if(!s2.isEmpty())
           return s2.pop();
           else return -1;
        }
        
        public int peek() {
           if(!s2.isEmpty())
        return s2.peek();
        else return -1;
        }
        
        public boolean empty() {
        return s2.isEmpty();
        
        }
    }