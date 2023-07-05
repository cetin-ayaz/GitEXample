public class Example {
    public static void main(String[] args) {
        int[] number1 = {0, 2, 4};
        System.out.println("lucky13(number1) = " + lucky13(number1));
    }

    public static boolean lucky13(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3) {
                return false;
            }
        }
        return true;

    }
}