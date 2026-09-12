class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        set<int> ak;
        for(int i : nums){
            ak.insert(i);
        }
        int k = 0;
        for(int i : ak){
            nums[k++] = i; 
        }
        return k;
    }
};