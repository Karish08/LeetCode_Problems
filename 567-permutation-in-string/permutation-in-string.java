class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.contains(s1)) return true;
        char ak[] = s1.toCharArray();
        Arrays.sort(ak);
        s1 = new String(ak);
        for(int i = 0; i<=s2.length() - s1.length(); i++){
            String m = s2.substring(i, i + s1.length());
            char kb[] = m.toCharArray();
            Arrays.sort(kb);
            m = new String(kb);
            if(m.equals(s1)) return true;
        }
        return false;
    }
}