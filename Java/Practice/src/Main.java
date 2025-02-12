import java.util.List;

public class Main {
    public static void main(String[] args) {
        MinHeapInternal minHeap = new MinHeapInternal();
        minHeap.minHeapPracticeTopKElements(List.of(1,7,5,4,9,2), 3);
    }
}