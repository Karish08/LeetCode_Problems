class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        map<string, vector<string>> ak;
        for(string m : strs){
            string key = m;
            sort(key.begin(), key.end());
            ak[key].push_back(m);
        }
        vector<vector<string>> kb;
        for(auto entry : ak){
            kb.push_back(entry.second);
        }
        return kb;
    }
};