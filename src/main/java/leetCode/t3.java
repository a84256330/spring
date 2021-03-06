package leetCode;

import org.junit.jupiter.api.Test;

/**
 * @author ma
 * @version 1.0 {2019/12/19}
 */
public class t3 {
    public boolean isPalindrome(String s) {
        int l = 0,r = s.length()-1;
        while(l<r){
            if(!Character.isLetterOrDigit(s.charAt(l))){
                l++;
            }else if(!Character.isLetterOrDigit(s.charAt(r))){
                r--;
            }else {
                if(Character.toLowerCase(s.charAt(l))==Character.toLowerCase(s.charAt(r))){
                    l++;
                    r--;
                }else {
                    return false;
                }
            }
        }
            return true;
    }


    @Test
    public void test(){
        String a = "l  e v el  ";
        System.out.println(this.isPalindrome(a));
    }
}
