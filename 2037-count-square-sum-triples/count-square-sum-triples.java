class Solution {
    public int countTriples(int n) {
        int count = 0;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                int num = (i * i + j * j);
                for(int k = 1; k<=n; k++){
                    if(num == k * k) count++;
                }
            }
        }return count; 
    }
}