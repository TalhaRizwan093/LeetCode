import java.util.*;

public class GroupAnagrams {
    public static void solve(){
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
