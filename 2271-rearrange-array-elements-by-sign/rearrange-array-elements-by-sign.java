class Solution {
    public int[] rearrangeArray(int[] nums) {
        int ak[] = new int[nums.length];
        int k = 0;
        int j = 1;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] > 0){
                  ak[k] = nums[i];
                  k += 2;
            }
            else{
                ak[j] = nums[i];
                j += 2;
            }
        }
       return ak;
    }
}