class Solution {
public:
    vector<int> buildArray(vector<int>& nums) {
        vector<int> ak(nums.size());
        for(int i = 0; i<nums.size(); i++){
            ak[i] = nums[nums[i]];
        }
        return ak;
    }
};