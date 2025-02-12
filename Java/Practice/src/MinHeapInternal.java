import java.util.List;
import java.util.PriorityQueue;

public class MinHeapInternal {

    public void minHeapPracticeTopKElements(List<Integer> arrayOfValues, int k){

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (Integer integer : arrayOfValues) {
            if (minHeap.size() < k) {
                minHeap.add(integer);
            } else {
                if (minHeap.peek() != null && integer > minHeap.peek()) {
                    minHeap.poll();
                    minHeap.add(integer);
                }
            }
        }

        System.out.println(minHeap);

    }

}
