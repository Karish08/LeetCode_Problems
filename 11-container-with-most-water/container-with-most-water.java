class Solution {
    public int maxArea(int[] height) {
        int right = height.length - 1;
        int left = 0;
        int max = 0;
        while(left < right){
            int sum  = Math.min(height[left], height[right]) * (right - left);
            if(sum > max) max = sum;
            if(height[left] > height[right]) right--;
            else left++;
        }
        return max;
    }
}