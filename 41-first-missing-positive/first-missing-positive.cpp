class Solution {
public:
    int firstMissingPositive(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        // /nums.erase(unique(nums.begin(), nums.end()), nums.end());
        int a = 1;
        int i = 0;
        while(i < nums.size() && nums[i] <= 0){
            i++;
        }
        while(i < nums.size()){
            if(nums[i] == a) a++;
            i++;
        }return a;
    }
};