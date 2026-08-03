class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd = 0;
        int even  = 0;
        int ak = 1;
        int kb = 2;
        for(int i=0; i<n; i++){
            odd += ak;
            ak +=2;
        }
        for(int i=0; i<n; i++){
            even += kb;
            kb +=2;
        }
        return GCDOf(odd, even);
    }
    static int GCDOf(int a, int b){
        if(b == 0) return a ;
        return GCDOf(b, a % b);
    }
}