class Solution {
    public int countPrimes(int n) {
        boolean ak[] = new boolean[n];
        for(int i = 2; i<n; i++){
            ak[i] = true;
        }
        for(int  i = 2; i * i < n; i++){
            if(ak[i]) {
                for(int j = i * i; j < n; j += i) {
                    ak[j] = false;
                }
            }
        }
        int count = 0;
        for(int i = 0; i<n; i++){
            if(ak[i] == true) count++;
        }return count; 
    }
   
}