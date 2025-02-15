public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Solution solution = new Solution();
        int[] res = solution.productExceptSelfBruteForce(new int[]{1,2,4,6});
        for (int i : res)
            System.out.print(i + " ");

        System.out.println();

        int[] res2 = solution.productExceptSelfDivision(new int[]{1,2,4,6});
        for (int i : res2)
            System.out.print(i + " ");

        System.out.println();

        int[] res3 = solution.productExceptSelfPrefixPostFix(new int[]{1,2,4,6});
        for (int i : res3)
            System.out.print(i + " ");

    }
}