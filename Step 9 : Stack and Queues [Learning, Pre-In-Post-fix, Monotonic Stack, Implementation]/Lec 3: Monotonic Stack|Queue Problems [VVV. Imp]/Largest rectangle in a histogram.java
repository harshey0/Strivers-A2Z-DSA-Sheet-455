class Solution {
    public int largestRectangleArea(int[] histo) {
        Stack < Integer > st = new Stack < > ();
        int maxA = 0;
        int n = histo.length;
        for (int i = 0; i <= n; i++) {
            while (!st.empty() && (i == n || histo[st.peek()] >= histo[i])) {
                int height = histo[st.peek()];
                st.pop();
                int width;
                if (st.empty())
                    width = i;
                else
                    width = i - st.peek() - 1;
                maxA = Math.max(maxA, width * height);
            }
            st.push(i);
        }
        return maxA;
    }
}




// class Solution {
//     public ArrayList<Integer> prev(int[] n) {
      
//         Stack<Integer> s = new Stack<>();
//         ArrayList<Integer> list = new ArrayList();
//         list.add(-1);
//         for(int x=1;x<n.length;x++)
//        { 
//         if(n[x]>n[x-1])
//         {list.add(x-1);s.push(x-1);}
//         else
//         {
//             while(!s.isEmpty() && n[s.peek()]>=n[x])
//             {
//                 s.pop();
//             }
//             int c=-1;
//             if(!s.isEmpty())
//             c=s.peek();
//             list.add(c);
//         }
//        }
//        return list;
//     }
//     public ArrayList<Integer> next(int[] n) {
      
//         Stack<Integer> s = new Stack<>();
//         ArrayList<Integer> list = new ArrayList();
//         list.add(-1);
//         for(int x=n.length-2;x>=0;x--)
//        { 
//         if(n[x]>n[x+1])
//         {list.add(0,x+1);s.push(x+1);}
//         else
//         {
//             while(!s.isEmpty() && n[s.peek()]>=n[x])
//             {
//                 s.pop();
//             }
//             int c=-1;
//             if(!s.isEmpty())
//             c=s.peek();
//             list.add(0,c);
//         }
//        }
//        return list;
//     }
//     public int largestRectangleArea(int[] heights) {
//         ArrayList<Integer> prev = prev(heights);
//         ArrayList<Integer> next = next(heights);
//         int max=0;

//         for(int x=0;x<heights.length;x++)
//         {
//             int c=x-prev.get(x);
//             int d=next.get(x)-x-1;
//             if(next.get(x)<0)
//             d=heights.length-next.get(x)-x-2;
//             max=Math.max(max,(c+d)*heights[x]);
//         }
//         return max;
//     }
// }