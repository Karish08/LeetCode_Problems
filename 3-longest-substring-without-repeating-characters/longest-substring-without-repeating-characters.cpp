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
              if(count > max1) max1 = count; 
              ak += s[j];
              j++;
           }
           else{
             ak = "";
             count = 1;
             j = i + 1;
             ak += s[j];
             i++;
             j++;
           }
        }
         if(count > max1) max1 = count; 
         return max1;
    }
};