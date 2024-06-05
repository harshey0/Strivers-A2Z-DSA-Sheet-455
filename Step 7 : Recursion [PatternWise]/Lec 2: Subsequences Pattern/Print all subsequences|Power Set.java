class Solution {

    void generate(int[] nums ,int i, List<List<Integer>> list , List<Integer> list2) {
 // Write your code here.
 if(i==nums.length)
 {
     list.add(new ArrayList<> (list2));
     return;
 }
 generate(nums,i+1,list ,list2);
 list2.add(nums[i]);
 generate(nums,i+1,list ,list2);
 list2.remove(list2.size()-1);
}

public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> list = new ArrayList();
    List<Integer> list2 = new ArrayList();
 generate(nums,0,list,list2);
 return list;
}
}