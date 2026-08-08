class Solution {
    public int totalNumbers(int[] digits) {
        Set<Integer> ak = new HashSet<>();
        for(int i = 0; i< digits.length; i++){
            if(digits[i] != 0){
                for(int j = 0; j< digits.length; j++){
                   if(i != j){
                        for(int z = 0; z < digits.length; z++){
                            if((z != i && z != j)){
                                int sum = digits[i] * 100 + digits[j] * 10 + digits[z];
                                if(sum % 2 == 0){
                                   ak.add(sum);
                                }
                            }
                        }
                    }
                }
            }            
        }return ak.size();
    }
}