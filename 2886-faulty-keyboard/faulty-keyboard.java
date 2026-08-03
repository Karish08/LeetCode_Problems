class Solution {
    public String finalString(String s) {
        StringBuilder sb = new StringBuilder();
        for(char m : s.toCharArray()){
            if(m == 'i') sb.reverse();
            else sb.append(m);
        }return sb.toString();
    }
}