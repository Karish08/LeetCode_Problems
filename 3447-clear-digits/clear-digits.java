class Solution {
    public String clearDigits(String s) {
        Stack<Character> ak = new Stack<>();
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)) {
                if(!ak.isEmpty()) ak.pop();
            }
            else ak.push(c);
        }
        StringBuilder sb = new StringBuilder();
        while(!ak.isEmpty()){
            sb.append(ak.pop());
        }
        return sb.reverse().toString();
    }
}