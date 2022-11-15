package dz1;

public class first {

        public int[] buildArray(int[] nums1) {
            int[] ans = new int[nums1.length];
            for (int i = 0 ; i<nums1.length;i++){
                ans[i] =nums1[nums1[i]];
            }
            return ans;
        }
    }

