class Solution {
public:
    int findDuplicate(vector<int>& nums) {
        map<int, int> ak;
        for(int i : nums){
           ak[i]++;
        }
        for(auto entry : nums){
            if(ak[entry] > 1) return entry;
        }return 0;
    }
};