class Solution {
public:
    vector<bool> kidsWithCandies(vector<int>& candies, int extraCandies) {
        vector<bool> ak(candies.size());
        int mx = *max_element(candies.begin(), candies.end());
        for(int i = 0; i<candies.size(); i++){
            if(candies[i] + extraCandies >= mx) ak[i] = true;
            else ak[i] = false;
        }
        return ak;
    }
};