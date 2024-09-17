import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Boolean> map = new HashMap<>();
        int count = 0;
        for(String w : s1.split("\\s+")) {
            if(map.get(w) == null) {
                map.put(w, true);
                count++;
            }else {
                if(map.get(w)) {
                    count--;
                }
                map.put(w, false);
            }
        }
        for(String w : s2.split("\\s+")) {
            if(map.get(w) == null) {
                map.put(w, true);
                count++;
            }else {
                if(map.get(w)) {
                    count--;
                }
                map.put(w, false);
            }
        }
        String[] res= new String[count];

        int i = 0;
        for(Map.Entry<String, Boolean> e : map.entrySet()) {
            if(e.getValue()) {
                res[i++] = e.getKey();
            }
        }
        return res;       
    }
}