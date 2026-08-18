class Solution {
    public void rotate(int[] nums, int k) {
       Queue<Integer> ak = new LinkedList<>();
       int n = nums.length;
       k = k % n;
       for(int i = n - k; i < n; i++){ 
          ak.offer(nums[i]);
       }
       for(int i = 0; i < n - k; i++){ 
          ak.offer(nums[i]);
       }
       for(int i = 0; i<n; i++){
          nums[i] = ak.poll();
       }
    }
}