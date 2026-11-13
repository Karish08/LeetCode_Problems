class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder sb = new StringBuilder();
        int min = Math.min(strs[0].length(), strs[strs.length - 1].length());
        for(int i = 0; i < min; i++){
            if(strs[0].charAt(i) != strs[strs.length - 1].charAt(i)) break;
            sb.append(strs[0].charAt(i));
        }
        return sb.toString();
    }
}