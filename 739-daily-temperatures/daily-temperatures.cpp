class Solution {
public:
    vector<int> dailyTemperatures(vector<int>& temp) {
        vector<int> ak(temp.size());
        stack<int> mj;
        for(int i = 0; i<temp.size(); i++){
            while(!mj.empty() && temp[i] > temp[mj.top()]){
                int index = mj.top();
                ak[index] = i - index;
                mj.pop();
            }
            mj.push(i);
        }
        return ak; 
    }
};