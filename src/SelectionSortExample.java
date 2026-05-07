public class SelectionSortExample {

    public static void main(String[] args) {

        int[] nums = {6, 5, 2, 8, 9, 4};

        System.out.println("Before sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        System.out.println();
        System.out.println("---------------------------");

        // Selection Sort
        for (int i = 0; i < nums.length - 1; i++) {

            int minIndex = i;

            // Find minimum element
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;

            // Print array after each pass
            for (int num : nums) {
                System.out.print(num + " ");
            }

            System.out.println();
        }

        System.out.println("---------------------------");
        System.out.println("After sorting:");

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}