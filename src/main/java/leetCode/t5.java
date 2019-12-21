package leetCode;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class t5 {
    public boolean wordBreak(String s, List<String> wordDict) {

        return work_BreaK(s,new HashSet(wordDict),0,new Boolean[s.length()]);

    }
    public boolean work_BreaK(String s, Set<String> wordDict, int start, Boolean[] booleans){
        if(s.length()==start){
            return true;
        }
        if(booleans[start]!=null){
            return booleans[start];
        }
        for (int end = start + 1; end < s.length(); end++) {

            if(wordDict.contains(s.substring(start,end))
                    && work_BreaK(s,wordDict,end,booleans)){
                return booleans[start] = true;
            }
        }
        return booleans[start] = false;
    }

//    @Test
//    public void test(){
//        t5 t = new t5();
//        t.wordBreak()
//    }
}
