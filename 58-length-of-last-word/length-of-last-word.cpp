class Solution {
public:
    int lengthOfLastWord(string s) {
        int count = 0;
        for(int i = s.size() - 1; i >= 0; i--){
            if(isalpha(s[i])) break;
            count++;
        }
        int count1 = 0;
        for(int i = s.size() - 1 - count; i >= 0; i--){
            if(s[i] == ' ') break;
            count1++;
        }
        return count1;
    }
};