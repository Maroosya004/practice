public class EvenNumbers {

    public static void main(String[] args) {
        int[] nums = new int[100];
        int i = 0;
        // Заполнить массив случайными числами. Например: nums[i] = рандомное число
        while (i < nums.length) {
            nums[i] = i;
            i = i + 1;
        }
        // Если число чётное выводить строку: nums[j] = j - чётное
        // Если не чётное: nums[j] = j - не чётное
        // % проверка остатка от деления
        // 13 % 2 = 1 - не чётное
        // 14 % 2 = 0 - чётное
        for (int j=0; j < nums.length; j = j + 1) {
            System.out.println("nums[" + j + "] = " + j);
            // names[ + 0 + ] = 0
        }
    }
}
