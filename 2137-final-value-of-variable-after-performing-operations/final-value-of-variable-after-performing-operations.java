class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String ak : operations){
            if(ak.equals("X++") || ak.equals("++X")) x++;
            else x--;
        }
        return x;
    }
}