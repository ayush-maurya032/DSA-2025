import java.util.Arrays;

public class MergeSortedArrays{
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1,3,nums2,3);
        System.out.println(Arrays.toString(nums1));

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;  // Last valid element in nums1
         int p2 = n - 1;  // Last element in nums2
         int p = m + n - 1;  // Last index of nums1
 
         while (p1 >= 0 && p2 >= 0) {
             if (nums1[p1] > nums2[p2]) {
                 nums1[p] = nums1[p1];
                 p1--;
             } else {
                 nums1[p] = nums2[p2];
                 p2--;
             }
             p--;
         }
 
         // If there are remaining elements in nums2, copy them
         while (p2 >= 0) {
             nums1[p] = nums2[p2];
             p2--;
             p--;
         }
     }

}