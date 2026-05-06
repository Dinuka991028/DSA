public class BubbleSortAnimation {

    public static void main(String[] args) throws InterruptedException {

        int[] nums = {6, 5, 2, 8, 9, 4};
        int size = nums.length;

        System.out.println("Initial Array:");
        printArray(nums);

        for (int i = 0; i < size - 1; i++) {
            System.out.println("\nPASS " + (i + 1) + ":");

            for (int j = 0; j < size - i - 1; j++) {

                // Highlight comparison
                System.out.print("Comparing index " + j + " and " + (j + 1) + ": ");
                printArrayWithHighlight(nums, j, j + 1);

                Thread.sleep(500); // delay for animation effect

                if (nums[j] > nums[j + 1]) {
                    System.out.println("→ Swapping " + nums[j] + " and " + nums[j + 1]);

                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;

                    printArray(nums);
                } else {
                    System.out.println("→ No swap");
                }

                Thread.sleep(500);
            }
        }

        System.out.println("\nFinal Sorted Array:");
        printArray(nums);
    }

    // Normal print
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Highlight compared elements
    public static void printArrayWithHighlight(int[] arr, int i, int j) {
        for (int k = 0; k < arr.length; k++) {
            if (k == i || k == j) {
                System.out.print("[" + arr[k] + "] ");
            } else {
                System.out.print(arr[k] + " ");
            }
        }
        System.out.println();
    }
}