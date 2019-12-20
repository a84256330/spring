package leetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * 分割回文串
 * @author ma
 * @version 1.0 {2019/12/20}
 */
public class t4 {

    private String s;
    List<List<String>> list = new ArrayList<>();
    public List<List<String>> partition(String str) {
        List<String> ll = new ArrayList<>();
        this.s = str;

        dfs(ll,0);

        list.add(ll);

        return list;
    }

    private void dfs(List<String> ll, int index) {
        if(s.length() == index){
            list.add(ll);
            return;
        }
        for (int i = index; i < s.length(); i++) {

            if(isPalindrome(i,index)){
                ll.add(s.substring(index,i+1));
                dfs(ll,i+1);
                ll.remove(ll.size()-1);
            }
        }
    }

    /**
     * 判断回文子
     * @param i
     * @param index
     * @return
     */
    private boolean isPalindrome(int i, int index) {
        while (i<index){
            if (s.charAt(i)!=s.charAt(index)) {
                return false;
            }
            i++;
            index--;
        }
        return true;
    }

    public static void main(String[] args) {
        (new t4()).partition("abb");
    }
}
