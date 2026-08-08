class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Queue<Integer> ak = new LinkedList<>();        
        Arrays.sort(deck);
        ak.offer(deck[deck.length - 1]);
        for(int i = deck.length - 2; i >= 0; i--){
            Queue<Integer> kb = new LinkedList<>();
            while(!(ak.isEmpty()) && ak.size() != 1){
                kb.offer(ak.poll());
            }
            //  m = 0;
            int m = ak.poll();
            ak.offer(deck[i]);
            // System.out.print(deck[i] + " ");
            ak.offer(m);
            // System.out.print(m + " ");
            while(!kb.isEmpty()){
                // System.out.print(kb.peek() + " ");
                ak.offer(kb.poll());
            }
            // System.out.println();
        }
        for(int i = 0;i<deck.length;i++){
            deck[i] = ak.poll();
        }
        return deck;
    }
}