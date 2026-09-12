class Solution {
public:
    string reverseWords(string s) {
        vector<string> ak;
        string m = "";
        for(char c : s){
            if(c == ' '){
                ak.push_back(m);
                m = "";
            }
            else  m += c;
        }
        ak.push_back(m);
        reverse(ak.begin(), ak.end());
        string mj;
        for(string pr : ak){
           if(pr != ""){
             mj += pr;
             mj += " ";
           }
        }
        mj.pop_back();
        return mj;
    }
};
	