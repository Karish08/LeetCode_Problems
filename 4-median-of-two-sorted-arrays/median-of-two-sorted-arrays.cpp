class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        vector<int> ak;
        int k = 0;
        int m = 0;
        int i = 0;
        for(i = 0; i < nums1.size() + nums2.size() && k < nums1.size() && m < nums2.size(); i++){
            if(nums1[k] < nums2[m]){
                ak.push_back(nums1[k]);
                k++;
            }
            else{
                ak.push_back(nums2[m]);
                m++;
            }
        }
        while(k < nums1.size()){
            ak.push_back(nums1[k++]);
        }
        while(m < nums2.size()){
            ak.push_back(nums2[m++]);
        }
        if(ak.size() % 2 != 0) return (double) ak[ak.size() / 2];
        else{
            double sum = ak[ak.size() / 2] + ak[ak.size() / 2 - 1];
            return sum/2;
        } 
    }
};