class Solution {
public:
    bool isHappy(int n) {
        while(n > 1){
            int sum = 0;
            while(n != 0){
                int mod = n % 10;
                sum += (mod * mod);
                n /= 10;
            }
            if(sum == 4) return false;
            n = sum;
        }
        return n == 1;
    }
};