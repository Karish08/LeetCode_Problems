class Solution {
public:
    bool checkInclusion(string s1, string s2) {
        if(s1.size() > s2.size()) return false;
    
        // if(s1.size()==1 && s2.find(s1) != string :: npos) return true;
        sort(s1.begin(), s1.end());
        for(int i = 0; i<=s2.size() - s1.size(); i++){
            string ak = s2.substr(i, s1.size());
            sort(ak.begin(), ak.end());
            if(ak == s1) return true;
        }
        return false;
    }
};