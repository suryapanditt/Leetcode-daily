public class Q162 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};   
        int n = nums.length;
        int peakIndex = n - 1;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                peakIndex = i;
                break;
            }
        }
        System.out.println("Peak element index: " + peakIndex);
    }
}
