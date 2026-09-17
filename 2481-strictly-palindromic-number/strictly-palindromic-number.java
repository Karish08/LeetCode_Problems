class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i = 2; i<n; i++){
            String ak = Integer.toString(n, i);
            String kb = new StringBuilder(ak).reverse().toString();
            if(!ak.equals(kb)) return false;
        }return true;
        
    }
}