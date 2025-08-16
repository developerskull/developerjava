import java.util.Scanner;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1}; // Not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\tENTER THE SIZE OF THE ARRAY:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n\tENTER THE ELEMENT:");
            arr[i] = sc.nextInt();
        }

        System.out.println("\n\tARRAY ELEMENTS ARE:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("\n\tENTER THE TARGET VALUE:");
        int c = sc.nextInt();

        Solution sol = new Solution();
        int[] result = sol.twoSum(arr, c);
        if (result[0] != -1) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two sum solution found.");
        }
    }
}