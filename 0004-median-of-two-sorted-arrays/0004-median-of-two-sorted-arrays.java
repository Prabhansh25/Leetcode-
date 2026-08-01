import java.util.ArrayList;
import java.util.List;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> merged = new ArrayList<>();
        int i = 0, j = 0;
        int n = nums1.length;
        int m = nums2.length;
        
      
        while (i < n && j < m) {
            if (nums1[i] <= nums2[j]) {
                merged.add(nums1[i]);
                i++;
            } else {
                merged.add(nums2[j]);
                j++;
            }
        }
        
        
        while (i < n) {
            merged.add(nums1[i]);
            i++;
        }
        while (j < m) {
            merged.add(nums2[j]);
            j++;
        }
        
        int totalLength = merged.size();
        
        
        if (totalLength % 2 == 1) {
            return merged.get(totalLength / 2);
        } else {
            int mid1 = merged.get((totalLength / 2) - 1);
            int mid2 = merged.get(totalLength / 2);
            return (mid1 + mid2) / 2.0; 
        }
    }
}