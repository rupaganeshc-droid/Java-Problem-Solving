class solution{
    public void merge(int[] nums1,int m,int[] nums2,int n){
        int i = m-1;
        int j = n-1;
        int k = m+n-1;


        while(j>=0)
        {
        if(i<0)
        {
            nums1[k--] = nums2[j--];
        }
        else if(nums1[i]>=nums2[j])
        {
            nums1[k--] = nums1[j--];
        }
        else
        {
            nums1[k--] = nums2[j--];
        }
    }
 }
}
class Merge{
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int N = nums2.length();
        int[] result =solution.merge(nums1,nums2,N);

    }
}