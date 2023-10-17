public class RunningTotal {

    public int[] runningSum(int[] nums) {

        int total = 0;
        int[] result = new int[nums.length];

        //Iterate through array, adding each element to the total and
        //putting the result into our result array.
        for(int i = 0; i < nums.length; i++){
            total = total + nums[i];
            result[i] = total;
        }

        return result;
    }
}
