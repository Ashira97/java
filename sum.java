class sum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = {0,1};
        boolean flag = false;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                System.out.println(nums[i]+"  "+nums[j]);
                if(nums[i]+nums[j] == target){
                    flag = true;
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
            if(flag){break;}
        }
        return result;
    }

    public static void main(String args[]){
        int[] nums = {3,2,4};
        int target = 6;
        sum t = new sum();
        int[] result = t.twoSum(nums,target);
        // System.out.println(result);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}