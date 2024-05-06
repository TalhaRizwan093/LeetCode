import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        Map<String, List> hashMap = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);

            if(!hashMap.containsKey(sortedStr)){
                List entires = new ArrayList<>();
                entires.add(strs[i]);
                hashMap.put(sortedStr,entires);
            }
            else{
                List entries = hashMap.get(sortedStr);
                entries.add(strs[i]);
                hashMap.put(sortedStr,entries);
            }
        }

        List<List<String>> finalList = new ArrayList<>();
        for (Map.Entry<String, List> entry : hashMap.entrySet()) {
            finalList.add(entry.getValue());
        }

        System.out.println(finalList);

    }
}



//char[] chars = strs[0].toCharArray();
//Arrays.sort(chars);
//System.out.println(chars);