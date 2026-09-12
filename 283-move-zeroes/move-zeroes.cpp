class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        vector<int> ak(nums.size());
        int k = 0;
        for(int i = 0; i<nums.size(); i++){
            if(nums[i] != 0) ak[k++] = nums[i]; 
        }
        int i;
        for(i = 0; i<nums.size(); i++){
            nums[i] = ak[i];
        }
        while(i < nums.size()){
            nums[i++] = 0;
        }
    }
};