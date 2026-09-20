class Solution {
public:
    bool isPalindrome(string s) {
        string ak = "";
        for(char m : s){
            if(isalpha(m) || isdigit(m)){
                ak += tolower(m);
            }
        }
        string mj = ak;
        reverse(mj.begin(), mj.end());
        if(mj == ak) return true;
        return false;
    }
};