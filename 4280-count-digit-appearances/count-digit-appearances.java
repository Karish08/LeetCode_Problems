class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        StringBuilder sb = new StringBuilder();
        for(int i : nums){
            sb.append(i);
        }
        int count = 0;
        for(int i = 0; i<sb.length(); i++){
            if(sb.charAt(i) == (char)(digit + '0')) count++;
        }return count;
    }
}