class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int ak[]=new int[nums1.length+nums2.length];
        int k=0;
        for(int i=0;i<nums1.length;i++){
            ak[k++]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            ak[k++]=nums2[i];
        }
        Arrays.sort(ak);
        double ans=0;
        int mid=ak.length/2;
        if(ak.length%2==0){
            ans=(ak[mid]+ak[mid-1])/2.0;
            return ans;
        }else{
            return ak[mid];
        }
    }
}