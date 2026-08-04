class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int k = 0;
        int ak[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                ak[i][j] = k++;
            }
        }
        int i = 0;
        int j = 0;
        for(String m : commands){
            if(m.equals("RIGHT")) j++;
            else if(m.equals("LEFT")) j--;
            else if(m.equals("UP")) i--;
            else i++;
        }return ak[i][j];
    }
}