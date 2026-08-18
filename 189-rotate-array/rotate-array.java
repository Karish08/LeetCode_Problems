class Solution {
    public void rotate(int[] nums, int k) {
       Queue<Integer> ak = new LinkedList<>();
       for(int i : nums){
        ak.offer(i);
       } 
       int n = nums.length;
       k = k % n;
       k = (n - k) % n;
       for(int i = 0; i<k; i++){
          ak.offer(ak.poll());
       }
       for(int i = 0; i<n; i++){
          nums[i] = ak.poll();
       }
    }
}