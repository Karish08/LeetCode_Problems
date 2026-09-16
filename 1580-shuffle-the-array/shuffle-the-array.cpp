class Solution {
public:
    vector<int> shuffle(vector<int>& nums, int n) {
        vector<int> ak(nums.size());
        int j = 0;
        for(int i = 0;i < nums.size() - n; i++){
            ak[j++] = nums[i];
            ak[j++] = nums[i + n]; 
        }
        return ak;
    }
};