class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> ak = new ArrayList<>();
        ArrayList<Integer> kb = new ArrayList<>();
        if(nums.length < 3) return nums;
        ak.add(nums[0]);
        kb.add(nums[1]);
        for(int i = 2; i<nums.length; i++){
            int n = ak.size();
            int m = kb.size();
            if(ak.get(n - 1) > kb.get(m - 1)){
                ak.add(nums[i]);
            }
            else{
                kb.add(nums[i]);
            }
        }
        int i;
        for(i = 0; i < ak.size(); i++){
            nums[i] = ak.get(i);
        }
        for(int j = 0; j < kb.size(); j++){
            nums[i++] = kb.get(j);
        }return nums;
    }
}