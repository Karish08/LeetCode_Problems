class Solution {
    public boolean canBeEqual(String s1, String s2) {
        if(s1.equals(s2)) return true;
        char ak[] = s1.toCharArray();
        char temp = ak[1];
        ak[1] = ak[3];
        ak[3] = temp;
        s1 = new String(ak);        
        if(s1.equals(s2)) return true;
        char a[] = s1.toCharArray();
        temp = a[0];
        a[0] = a[2];
        a[2] = temp;
        s1 = new String(a);
        if(s1.equals(s2)) return true;
        temp = a[1];
        a[1] = a[3];
        a[3] = temp;
        s1 = new String(a);
        return s1.equals(s2);
    }
}