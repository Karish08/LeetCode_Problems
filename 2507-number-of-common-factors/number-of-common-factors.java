class Solution {
    public int commonFactors(int a, int b) {
       int count = 1;
       int n = GCDOf(a,b);
       for(int i=2; i<=n; i++){
           if(a % i == 0 && b % i == 0) count++;
       }  return count; 
    }
    static int GCDOf(int a, int b){
        if(b == 0) return a;
        return GCDOf(b, a % b);
    }
}