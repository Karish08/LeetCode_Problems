class Solution {
public:
    string decodeString(string s) {
        stack<string> ak;
        stack<int> kb;
        string currstr = "";
        int curr = 0;
        for(int i = 0; i<s.size(); i++){
            char m = s[i];
            if(isdigit(m)){
                curr = curr * 10 + m - '0';
            }
            else if(m == '['){
                ak.push(currstr);
                kb.push(curr);
                currstr = "";
                curr = 0;
            }
            else if(isalpha(m)){
                currstr += m;
            }
            else{
                string mj = ak.top();
                string sm = currstr;
                for(int i =0; i< kb.top(); i++){
                    mj += sm;
                } 
                ak.pop();
                kb.pop();
                currstr = mj;
            }
        }return currstr;
    }
};