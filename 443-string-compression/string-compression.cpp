class Solution {
public:
    int compress(vector<char>& chars) {
       int count = 1;
       string ak = "";
       for(int i = 1; i<=chars.size(); i++){
          if(i < chars.size() && chars[i] == chars[i - 1]) count++;
          else {
            ak += chars[i - 1];
            if(count > 1) ak += to_string(count);
            count = 1;
          }
       }
       int k = 0;
       for(char c : ak){
        chars[k++] = c;
       }
       return k;
    }
};