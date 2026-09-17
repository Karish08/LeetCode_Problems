class Solution {
    public boolean rotateString(String s, String goal) {
        for(int i = 0; i< s.length(); i++){
            char ak = s.charAt(0);
            StringBuilder sb = new StringBuilder(s);
            sb.delete(0,1);
            sb.append(ak);
            if(sb.toString().equals(goal)) return true;
            s = sb.toString();
        }
        return false;
    }
}