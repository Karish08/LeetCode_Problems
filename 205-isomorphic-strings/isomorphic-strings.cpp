class Solution {
public:
    bool isIsomorphic(string s, string t) {
        map<char, char> ak;
        map<char, char> kb;
        if(s.size() != t.size()) return false;
        for(int i = 0; i<s.size(); i++){
            char m = s[i];
            char j = t[i];
            if(ak.find(m) != ak.end()){
                if(ak[m] != j) return false;
            }
            else{
                ak[m] = j;
            }

            if(kb.find(j) != kb.end()){
                if(kb[j] != m) return false;
            }
            else{
                kb[j] = m;
            }
        }return true;
    }
};