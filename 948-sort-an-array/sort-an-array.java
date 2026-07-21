class Solution {
    public int[] sortArray(int[] nums) {
        if(nums.length == 1) return nums;
        int mid = nums.length/2;
        int left[] = sortArray(Arrays.copyOfRange(nums, 0, mid));
        int right[] = sortArray(Arrays.copyOfRange(nums,mid,nums.length));
        return mergeSort(left, right);
    }
    public static int[] mergeSort(int [] first, int[]second){
        int result[] = new int[first.length + second.length];
        int i=0; int j=0; int k = 0;
        while(i < first.length && j < second.length){
            if(first[i] <= second[j]){
                result[k++] = first[i++];
            }
            else{
                result[k++] = second[j++];
            }
        }
        while(i < first.length){
            result[k++] = first[i++];
        }
        while(j < second.length){
            result[k++] = second[j++];
        }
        return result;
    }
}