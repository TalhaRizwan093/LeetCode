import java.util.*;

public class Prob347 {

    public static int[] solve(int[] nums, int k){
        //First solution work if K is the number of frequency
//        if(nums.length == k){
//            return nums;
//        }
//
//        int[] res = new int[nums.length];
//        HashMap<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
//        int resIndex = 0;
//        int resLength = 0;
//
//        for(int i: nums){
//            if(!freqMap.containsKey(i)){
//                freqMap.put(i,1);
//            }else{
//                freqMap.put(i, freqMap.getOrDefault(i, 1) + 1);
//            }
//
//            if(freqMap.get(i) == k){
//                res[resIndex] = i;
//                resLength++;
//                resIndex++;
//            }
//        }
//
//        int[] finalRes = new int[resLength];
//        int finalResItr = 0;
//
//        for(int i: res){
//            if(i != 0){
//                finalRes[finalResItr] = i;
//                finalResItr++;
//            }
//        }
//
//        return finalRes;

        HashMap<Integer, Integer> freqMap = new HashMap<Integer, Integer>();

        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
                (a, b) -> a.getValue() - b.getValue()
        );

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            minHeap.add(entry);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        int[] res = new int[k];
        for (int i = 0; i < res.length; i++) {
            res[i] = minHeap.poll().getKey();
        }

        return res;
    }

}
