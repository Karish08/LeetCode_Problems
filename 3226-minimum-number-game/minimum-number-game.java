class Solution {
    public int[] numberGame(int[] nums) {
       PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> a - b);
       for(int i : nums){
          pq.offer(i);
       } 
       int arr[] = new int[2];
       int ak[] = new int [nums.length];
       int index = 0;
       int i = 0;
       while(!pq.isEmpty()){
           if(i == 2){
              ak[index++] = arr[1];
              ak[index++] = arr[0];
              i = 0;
           }
           arr[i++] = pq.poll();
       }
       ak[index++] = arr[1];
       ak[index++] = arr[0];
       return ak;
    }
}