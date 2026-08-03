class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ak = new ArrayList<>();
        List<Integer> m = new ArrayList<>();
        for(int i : nums){
            m.add(i);
        }
        while(m.size() != 0){
            List<Integer> kb = new ArrayList<>();
            for(int i=0; i<m.size(); i++){
                if(!kb.contains(m.get(i))){
                    kb.add(m.get(i));
                    // System.out.println(i);                   
                    m.remove(i);
                     i--;                    
                }
            }
            ak.add(kb);
        }return ak;
    }
}
