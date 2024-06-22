public class RemoveElement {
    public static void Solve(){
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int valTimes = 0;

        for (int j : nums) {
            if (j == val) {
                valTimes++;
            }
        }

        int iterator = 0;
        for (int i = 0; i < nums.length * valTimes; i++) {
            if(nums[iterator] == val && iterator != nums.length - 1){
                int temp = nums[iterator];
                nums[iterator] = nums[iterator + 1];
                nums[iterator + 1] = temp;
            }
            iterator++;
            if(iterator == nums.length) {
                iterator = 0;
            }
        }
//        for (int num : nums) {
//            System.out.println(num);
//        }

        System.out.println(nums.length - valTimes);
    }
}
