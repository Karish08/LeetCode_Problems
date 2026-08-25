class Solution {
    public int[] shortestToChar(String s, char c) {
        ArrayList<Integer> ak = new ArrayList<>();
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == c) ak.add(i);
        }
        int mj[] = new int[s.length()];
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == c) continue;
            int min = Integer.MAX_VALUE;
            for(int j = 0; j<ak.size(); j++){
               int temp = Math.abs(i - ak.get(j));
               if(min > temp) min = temp;
            }
            mj[i] = min;
        }return mj;
    }
}