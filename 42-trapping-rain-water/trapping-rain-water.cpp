class Solution {
public:
    int trap(vector<int>& height) {
        int answer = 0;
        int n = height.size();
        int left = 0;
        int right = n - 1;
        int leftMax = height[0];
        int rightMax = height[n - 1];
        while(left <= right){
            if(leftMax < rightMax){
                leftMax = max(leftMax, height[left]);
                answer += leftMax - height[left];
                left ++;
            }
            else{
                rightMax = max(rightMax, height[right]);
                answer += rightMax - height[right];
                right--;
            }
        }return answer;
    }
};