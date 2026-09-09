class Solution {
public:
    string reverseVowels(string s) {
        string ak = "";
        for(int i = 0; i<s.size(); i++){
            if(string("AEIOUaeiou").find(s[i]) != string :: npos) ak += s[i];
        }
        reverse(ak.begin(), ak.end());
        int k = 0;
        for(int i = 0; i<s.size(); i++){
            if(string("AEIOUaeiou").find(s[i]) != string :: npos) s[i] = ak[k++];
        }
        return s;
    }
};