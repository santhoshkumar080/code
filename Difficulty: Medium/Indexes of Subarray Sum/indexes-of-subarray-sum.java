public class Solution {
    public static ArrayList<Integer> subarraySum(int[] arr, int target) {
        int start = 0;
        int currentSum = 0;
        ArrayList<Integer> result = new ArrayList<>();

        for (int end = 0; end < arr.length; end++) {
            currentSum += arr[end];

            while (currentSum > target && start <= end) {
                currentSum -= arr[start];
                start++;
            }

            if (currentSum == target) {
                result.add(start + 1); // 1-based index
                result.add(end + 1);
                return result;
            }
        }

        result.add(-1);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int target = 12;
        System.out.println(subarraySum(arr, target));
    }
}