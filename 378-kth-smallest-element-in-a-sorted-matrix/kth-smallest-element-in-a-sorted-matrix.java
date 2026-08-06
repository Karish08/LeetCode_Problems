class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        if(m * n < k) return 1;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> a - b);
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                pq.offer(matrix[i][j]);
            }
        }
        for(int i=0; i<k-1; i++){
            pq.poll();
        }return pq.poll();
    }
}