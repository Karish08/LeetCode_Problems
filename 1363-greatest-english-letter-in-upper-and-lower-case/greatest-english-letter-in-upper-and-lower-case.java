class Solution {
    public String greatestLetter(String s) {
        StringBuilder sb = new StringBuilder();
        Set<Character> m = new HashSet<>();
        StringBuilder sb1 = new StringBuilder(s);
        for(char c : s.toCharArray()){
            if(Character.isLowerCase(c) && sb1.toString().contains(String.valueOf(Character.toUpperCase(c)))){
                m.add(Character.toUpperCase(c));
            }
            if(Character.isUpperCase(c) && sb1.toString().contains(String.valueOf(Character.toLowerCase(c)))){
                m.add(c);
            }
        }
        
        PriorityQueue<Character> pq = new PriorityQueue<>((a,b) -> b.compareTo(a));
        for(char c : m){
            pq.offer(c);
        }
        if(!pq.isEmpty()) sb.append(pq.poll());
        return sb.toString();
    }
}