class Solution {
    public String frequencySort(String s) {
        
        ArrayList <Integer> list = new ArrayList();
        String ans="";

  for (int i = 0; i < 75; i++) {
            list.add(0); 
        }
         for(int x = s.length()-1;x>=0;x--)
        {
            int v = list.get((int)s.charAt(x)-48);
            list.set((int)s.charAt(x)-48,v+1);
        }

        for(int x=0;x<list.size();x++)
     { 
        int index = list.indexOf(Collections.max(list));
        for(int y=0;y<list.get(index);y++)
        {
            ans+=(char)(index+48);
        }
        list.set(index,-1);
}

return ans;

    }
}