import java.lang.*;

class LC724 {
    public static void main (String[] args) {
        int[] nums = {2,1,-1};
        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {
        if(nums.length==0){ return 0; }
        for(int pivot = 0; pivot<nums.length; pivot++){
            int lsum = 0, rsum = 0;
            for(int ls = 0; ls<pivot; ls++){
                lsum+=nums[ls];
            }
            for(int rs = pivot+1; rs<nums.length; rs++){
                rsum+=nums[rs];
            }
            if(rsum==lsum){
                return pivot;
            }
        }
        return -1;
    }
}