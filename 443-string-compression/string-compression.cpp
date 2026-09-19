class Solution {
public:
    int compress(vector<char>& chars) {
       int count = 0;
       string m = "";
       for(int i = 1; i<=chars.size();  i++){
          if(i < chars.size() && chars[i] == chars[i - 1]) count++;
          else {
             count++;
             m += chars[i - 1];
             if(count > 1) m += to_string(count);
             count = 0;
          }
       }
       int k = 0;
       for(char c : m){
           chars[k++] = c;
       }
       return k;
    }
};