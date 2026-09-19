class Solution {
public:
    int maxArea(vector<int>& height) {
        int left = 0;
        int right = height.size() - 1;
        int max1 = 0;
        while(left < right){
            int area = min(height[left], height[right]) * (right - left);
            if(max1 < area) max1 = area;
            if(height[left] < height[right]) left++;
            else right--;
        }
        return max1;
    }
};