class Solution {
    public List<Integer> majorityElement(int[] nums) {
      List<Integer> a=new ArrayList<>();
      int check = nums.length/3;
      int n = nums.length;
      HashMap<Integer, Integer> ak = new HashMap<>();
      for(int i : nums){
        ak.put(i, ak.getOrDefault(i, 0) + 1);
      }
    //   int max = 0;
    //   for(var entry : ak.values()){
    //     if(entry > max){
    //         max = entry;
    //     }
    //   }
      for(var entry : ak.entrySet()){
        if(entry.getValue() > check) a.add(entry.getKey());
      }return a;
    }
}