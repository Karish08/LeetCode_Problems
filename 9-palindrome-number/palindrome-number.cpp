class Solution {
public:
    bool isPalindrome(int x) {
        string s = to_string(x);
        string ak = s;
        reverse(s.begin(), s.end());
        return s.compare(ak) == 0;
    }
};