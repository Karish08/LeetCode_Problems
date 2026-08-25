class Solution {
    public int[] shortestToChar(String s, char c) {
        int count = 0;
        for(char a : s.toCharArray()){
            if(a == c) count++;
        }
        int m = 0;
        int ak[] = new int[count];
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == c) ak[m++] = i;
        }
        int mj[] = new int[s.length()];
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == c) continue;
            int min = Integer.MAX_VALUE;
            for(int j = 0; j<ak.length; j++){
               int temp = Math.abs(i - ak[j]);
               if(min > temp) min = temp;
            }
            mj[i] = min;
        }return mj;
    }
}