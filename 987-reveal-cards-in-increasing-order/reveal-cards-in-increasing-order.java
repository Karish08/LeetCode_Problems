class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Deque<Integer> ak = new ArrayDeque<>(); 
        Arrays.sort(deck);
        int n = deck.length;
        ak.offer(deck[n - 1]);
        for(int i = n - 2; i >= 0; i--){
            ak.addFirst(ak.removeLast());
            ak.addFirst(deck[i]);
        }
        
        for(int i = 0; i<n;i++){
            deck[i] = ak.poll();
        }
        return deck;
    }
}