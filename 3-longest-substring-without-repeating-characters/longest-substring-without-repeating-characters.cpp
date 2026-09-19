class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int max1 = 0;
        string ak = "";
        int j = 0;
        int i = 0;
        int count = 0;
        while(i < s.size() && j < s.size()){
           if(!ak.contains(s[j])){
              count++;
              max1 = max(count, max1);
              ak += s[j];
              j++;
           }
           else{
             ak = "";
             count = 1;
             j = i + 1;
             ak += s[i];
             i++;
           }
        }
         max1 = max(count, max1);
         return max1;
    }
};