class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ak = new ArrayList<>();
        Arrays.sort(nums);
        int i = nums[0];
        int j = 0;
        while(j < nums.length){
            if(nums[j] == i) j++;
            else ak.add(i);
            i++;
        }return ak;
    }
}