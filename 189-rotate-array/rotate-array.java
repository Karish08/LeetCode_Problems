class Solution {
    public void rotate(int[] nums, int k) {
       Queue<Integer> ak = new LinkedList<>();
       for(int i : nums){
        ak.offer(i);
       } 
       k = k % nums.length;
       k = (nums.length - k) % nums.length;
       for(int i = 0; i<k; i++){
          ak.offer(ak.poll());
       }
       for(int i = 0; i<nums.length; i++){
          nums[i] = ak.poll();
       }
    }
}