class solution{
    public int maxSubArray(int[] nums){

    
        int a = 0;
        int b = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int temp = a+nums[i];
            if(temp<nums[i]){
                a = nums[i];
            }
            else{
                a = temp;
            }

            if(b<a){
                b=a;
            }
        }
        return b;
    }
}
class MAX{
    public static void main(String[] args) {
        solution Solution = new solution();
        int[]nums={-2,1,-3,4,-1,2,1,-5,4};
        int result = Solution.maxSubArray(nums);
        System.out.println("MAXIMUM ARRAY =" +result);
    }
}