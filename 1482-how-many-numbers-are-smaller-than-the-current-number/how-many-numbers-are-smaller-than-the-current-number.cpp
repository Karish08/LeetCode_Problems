class Solution {
public:
    vector<int> smallerNumbersThanCurrent(vector<int>& nums) {
        int n = nums.size();
        vector<int> ak = nums;
        sort(nums.begin(), nums.end());
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(ak[i] == nums[j]){
                    ak[i] = j;
                    break;
                }
            }
        }
        return ak;
    }
};