import java.util.Arrays;
import java.util.ArrayList;
class test {
    public ArrayList<String> summaryRanges(int[] nums) {
        Arrays.sort(nums);
        // System.out.println(nums.toString());
        for(int i=0; i< nums.length;i++){
            System.out.print(nums[i]+"  ");
        }
        System.out.println();
        return getOut(nums);
        // result = getRange(nums);
        // return getStandardOutput(result);
    }

    public ArrayList<String> getOut(int[] nums){
        ArrayList<String> re = new ArrayList<String>();
        ArrayList<String> re2 = new ArrayList<String>();
        if(nums.length == 0){
            return re2;
        }

        int start = 0;
        int end = 0;
        for(int cursor = 1;cursor < nums.length ; cursor++){
            System.out.println(cursor + "  " + nums[cursor]);
            if(nums[cursor] == nums[cursor - 1] + 1){
                end = cursor;
            }else{
                re.add(String.valueOf(nums[start]) + "->" + String.valueOf(nums[end]));
                start = cursor;
                end = cursor;
            }
        }
        re.add(String.valueOf(nums[start]) + "->" + String.valueOf(nums[end]));
        // if(start == end){
        //     re.add(String.valueOf(nums[start]) + "->" + String.valueOf(nums[end]));
        // }else{
        //     re.add(String.valueOf(nums[start]) + "->" + String.valueOf(nums[end]));
        // }

        System.out.println(re);
        for(int i=0;i< re.size();i++){
            String item = re.get(i);
            String[] l = item.split("->");
            System.out.println(l[0] + "&" + l[1]);
            if(l[0].compareTo(l[1])==0){
                re2.add(l[0]);
            }else{
                re2.add(item);
            }
        }
        System.out.println(re2);
        return re2;
    }


    public static void main(String[] args){
        int[] nums = {0,2,4,6,8,9};
        test s = new test();
        ArrayList<String> r = s.summaryRanges(nums);
        System.out.println(r);
    }
}