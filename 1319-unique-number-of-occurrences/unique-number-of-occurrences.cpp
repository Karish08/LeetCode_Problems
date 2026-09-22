class Solution {
public:
    bool uniqueOccurrences(vector<int>& arr) {
        map<int, int> ak;
        for(int i = 0; i<arr.size(); i++){
            ak[arr[i]]++;
        }
        set<int> m;
        for(auto entry : ak){
            if(m.find(entry.second) != m.end()) return false;
            m.insert(entry.second);
        }return true;
    }
};