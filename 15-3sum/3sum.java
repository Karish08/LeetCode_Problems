class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> ak = new HashSet<>();
        List<List<Integer>> m = new ArrayList<>();
        int n = nums.length;
        for(int i =0; i<n; i++){
            int left = i+1;
            int right = n-1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    List<Integer> kb = new ArrayList<>();
                    kb.add(nums[i]);
                    kb.add(nums[left]);
                    kb.add(nums[right]);
                    ak.add(kb);
                    left++;
                    right--;
                }
                else if(sum < 0) left++;
                else right--;
            }
        }
        for(List<Integer> o : ak){
            m.add(o);
        }return m;
    }
}