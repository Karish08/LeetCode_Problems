class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
        vector<int> mj;
        int check = nums.size() / 3;
        unordered_map<int, int> ak;
        for(int i : nums){
            ak[i]++;
        }
        for(auto var : ak){
            if(var.second > check) mj.push_back(var.first);
        }
        return mj;
    }
};