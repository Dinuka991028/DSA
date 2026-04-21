public class Demo {
    public static void main(String[] args) {
        int nums[] = {1,2,3,5, 7, 9,10, 11, 13};
        int target = 1;

        int result1 = linearSearch(nums, target);
        int result2 = binarySearch(nums, target);
        int result3 = binarySearchRecursive(nums, target,0,nums.length-1,0);
        if (result1 != -1) {
            System.out.println("Element found at : " + result1);
        } else {
            System.out.println("Element Not Found");
        }

    }

    public static int linearSearch(int[] nums, int target) {
        int steps = 0;
        for (int i = 0; i < nums.length; i++) {
            steps++;
            if (nums[i] == target) {
                System.out.println("Steps taken by linear :" + steps);
                return i;
            }
        }
        System.out.println("Steps taken by linear :" + steps);
        return -1;
    }

    public static int binarySearch(int[] nums, int target) {
        int steps = 0;
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            steps++;
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                System.out.println("Steps taken by binary :" + steps);
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Steps taken by binary :" + steps);
        return -1;
    }

    public static int binarySearchRecursive(int[] nums, int target, int left, int right, int steps) {
        if (left > right) {
            System.out.println("Steps taken by binary :" + steps);
            return -1;
        }

        steps++;
        int mid = (left + right) / 2;

        if (nums[mid] == target) {
            System.out.println("Steps taken by binary :" + steps);
            return mid;
        } else if (nums[mid] < target) {
            return binarySearchRecursive(nums, target, mid + 1, right, steps);
        } else {
            return binarySearchRecursive(nums, target, left, mid - 1, steps);
        }
    }


}
