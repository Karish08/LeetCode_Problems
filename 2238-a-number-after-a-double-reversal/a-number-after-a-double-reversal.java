class Solution {
    public boolean isSameAfterReversals(int num) {
        int n = reverse(num);
        n = reverse(n);
        return n == num;
    }
    int reverse(int n){
        int rev = 0;
        while(n > 0){
            rev = (rev * 10) + (n % 10);
            n /= 10;
        }
        return rev;
    }
}