class Solution {
public:
    int uniquePaths(int m, int n) {
        int ak[m][n];
        for(int i = 0; i<m; i++){
            ak[i][0] = 1;
        }
        for(int i = 0; i<n; i++){
            ak[0][i] = 1;
        }
        for(int i = 1; i<m; i++){
            for(int j = 1; j<n; j++){
                ak[i][j] = ak[i - 1][j] + ak[i][j - 1];
            }
        }
        return ak[m - 1][n - 1];
    }
};