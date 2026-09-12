class Solution {
public:
    bool isAnagram(string s, string t) {
        map<char, int> ak;
        map<char, int> kb;
        for(char c : s){
            ak[c]++;
        }
        for(char c : t){
            kb[c]++;
        }
        for(char c : s){
            if(ak[c] != kb[c]) return false;
        }
        for(char c : t){
            if(ak[c] != kb[c]) return false;
        }
        return true;
    }
};