class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
       int count = 0;
       String ak[] = {"type", "color", "name"};
       int n = 0;
       for(int i=0; i < ak.length; i++){
             if(ak[i].equals(ruleKey)) {
                n = i;
                break;
             }
       }
       for(List<String> m : items){
          if(m.get(n).equals(ruleValue)) count++;
       } return count;
    }
}