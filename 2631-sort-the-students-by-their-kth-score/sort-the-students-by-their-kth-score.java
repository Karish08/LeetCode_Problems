class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        List<List<Integer>> ak = new ArrayList<>();
        int m = score.length;
        int n = score[0].length;
        List<Integer> sr = new ArrayList<>();
        for(int i=0; i<m; i++){
            sr.add(score[i][k]);
        }
        Collections.sort(sr,Collections.reverseOrder());
        for(int i=0; i<m; i++){
            List<Integer> mj = new ArrayList<>();
            for(int j=0; j<n; j++){
                mj.add(score[i][j]);
            }
            ak.add(mj);
        }
        List<List<Integer>> as = new ArrayList<>(); 
        for(int s : sr){
            for(List<Integer> p : ak){
                if(p.contains(s)){
                    as.add(p);
                    // System.out.println("true "+s);
                    break;
                }
            }
        }
        for(int i=0; i<m; i++){
            List<Integer> karish = as.get(i);
            for(int j=0; j<n; j++){
                int kl = karish.get(j);
                score[i][j] = kl;
            }
        }
        return score;
    }
}