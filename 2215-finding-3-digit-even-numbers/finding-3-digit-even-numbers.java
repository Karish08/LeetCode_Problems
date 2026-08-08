class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> ak = new TreeSet<>();
        for(int i = 0; i< digits.length; i++){
            if(digits[i] != 0){
                for(int j = 0; j< digits.length; j++){
                   if(i != j){
                        for(int z = 0; z < digits.length; z++){
                            if((z != i && z != j)){
                                int sum = (digits[i] * 10 + digits[j]) * 10 + digits[z];
                                if(sum % 2 == 0){
                                   ak.add(sum);
                                }
                            }
                        }
                    }
                }
            }            
        }
        int kb[] = new int[ak.size()];
        int m = 0;
        for(int i : ak){
           kb[m++] = i; 
        }
        return kb;
    }
}