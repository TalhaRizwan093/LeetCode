public class Solution {

    public int[] productExceptSelfBruteForce(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int result = 1;
            for(int j = 0; j < nums.length; j++) {
                if(i != j){
                    result *= nums[j];
                }
            }
            res[i] = result;
        }
        return res;
    }

    public int[] productExceptSelfDivision(int[] nums) {
        int[] res = new int[nums.length];
        int result = 1;
        int zeroIndex = -1;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                result *= nums[i];
            } else {
                zeroIndex = i;
            }
        }

        if(zeroIndex != -1){
            res[zeroIndex] = result == 1 ? 0 : result;
        } else {
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] == 0){
                    res[i] = result;
                } else {
                    res[i] = result / nums[i];
                }
            }
        }

        return res;
    }

    public int[] productExceptSelfPrefixPostFix(int[] nums) {
        int[] res = new int[nums.length];
        int[] postFix = new int[nums.length];
        int[] preFix = new int[nums.length];
        int prefixValue = 1; int postFixValue = 1;

        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                preFix[i] = prefixValue;
            } else {
                prefixValue *= nums[i - 1];
                preFix[i] = prefixValue;
            }
        }

        for(int i = nums.length - 1; i >= 0; i--){
            if(i == nums.length - 1){
                postFix[i] = postFixValue;
            } else {
                postFixValue *= nums[i + 1];
                postFix[i] = postFixValue;
            }
        }

        for(int i = 0; i < nums.length; i++){
            res[i] = preFix[i] * postFix[i];
        }


        return res;
    }

}
