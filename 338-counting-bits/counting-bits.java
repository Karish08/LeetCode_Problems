class Solution {
    public int[] countBits(int n) {
        int ak[] = new int[2 + n - 1]; 
        for(int i=0; i<=n; i++){
           if(i == 0) ak[i] = 0;
           else if(i == 1) ak[i] = 1;
           else {
              int count =0;
              int mj = i;
              while(mj != 0){
                mj = mj & (mj-1);
                count++;
              }
              ak[i] = count;
           }
        }return ak;
    }
}