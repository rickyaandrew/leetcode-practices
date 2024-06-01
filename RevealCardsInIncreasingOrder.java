import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class RevealCardsInIncreasingOrder {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        boolean isSkip = false;
        int[] result = new int[deck.length];
        int pointer = 0;
        Queue<Integer> queueNumber = new LinkedList<>();

        for (int i = 0; i < deck.length; i++) {
            queueNumber.add(i);
        }

        while (!queueNumber.isEmpty()) {
            int currQueueNumber = queueNumber.poll();
            if (isSkip) {
                queueNumber.add(currQueueNumber);
                isSkip = !isSkip;
                continue;
            }
            result[currQueueNumber] = deck[pointer];
            pointer++;
            isSkip = !isSkip;
        }

        return result;
    }
}
