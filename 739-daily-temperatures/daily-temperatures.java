class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int ak[] = new int [temp.length];
        Stack<Integer> m = new Stack<>();
        for(int i = 0; i < temp.length; i++){
            while(!m.isEmpty() && temp[i] > temp[m.peek()]){
                int index = m.pop();
                ak[index] = i - index;
            }
            m.push(i);
        }
         return ak;
    }
}