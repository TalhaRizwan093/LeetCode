import java.util.ArrayList;
import java.util.List;

class Solution {

    public String encode(List<String> strs) {
        String encodedString = "";
        for (String str : strs) {
            encodedString = encodedString + str.length() + "#" + str;
        }
        return encodedString;
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int decodedStringLength = 0;
        String word = "";
        String wordLen = "";
        boolean multiDigit = false;
        for (int i = 0; i < str.length(); i++) {
            if(decodedStringLength == 0){
                if(str.charAt(i + 1) == '#'){
                    wordLen += str.charAt(i);
                    decodedStringLength = Integer.parseInt(wordLen);
                    i = i + 2;
                    multiDigit = false;
                } else {
                    wordLen += str.charAt(i);
                    multiDigit = true;
                }
            }
            if(!multiDigit){
                if(decodedStringLength == 0){
                    res.add(word);
                    i--;
                } else {
                    word += str.charAt(i);
                    decodedStringLength--;
                    if(decodedStringLength == 0){
                        res.add(word);
                        word = "";
                        wordLen = "";
                    }
                }
            }

        }
        return res;
    }
}
