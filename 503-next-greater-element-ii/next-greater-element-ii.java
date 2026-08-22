class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int ak[] = new int[n];
        for(int i = 0; i < n - 1; i++){
            int right = i + 1;
            while(true){
                if(right == n){
                    right = -1;                    
                }
                else if(right == i){
                    ak[i] = -1;
                    break;
                }
                else if(nums[i] < nums[right]){
                    ak[i] = nums[right];
                    break;
                }
                right++;
            }            
        }
        boolean karish = true;
        for(int i = 0; i < n - 1; i++){
            if(nums[n - 1] < nums[i]){
                ak[n - 1] = nums[i];
                karish = false;
                break;
            }
            // if(i + 1 == n) ak[n - 1] = -1;
        }
         if(karish && ak[n - 1] == 0) ak[n - 1] = -1;
         return ak;
    }
}