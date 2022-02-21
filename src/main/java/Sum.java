public class Sum {
    public static void main(String[] args) {
        int[] sum = new int[]{2, 5, 10, 3};
        int i = 0;
        int result = 0;
        while (i < sum.length) {
            result = result + sum[i];
            i++;
        }
        System.out.println(result);
    }
}

