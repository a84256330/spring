package leetCode;

/**
 * @author ma
 * @version 1.0 {2019/12/18}
 */
public class t2 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int a = m-1;
        int b = n-1;
        int c = m+n-1;

        while (a>=0 && b>=0){
            nums1[c--] = nums1[a]>nums2[b]?nums1[a--]:nums2[b--];
        }
        System.arraycopy(nums2,0,nums1,0,b+1);

    }

    public static void main(String[] args) {

        int[] a = {1,2,3,0,0,0};

        int[] b = {4,5,6};
        (new t2()).merge(a,3,b,3);
    }
}
