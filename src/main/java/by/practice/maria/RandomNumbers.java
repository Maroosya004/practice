package by.practice.maria;

public class RandomNumbers {

    public static void main(String[] args) {
        int[] nums = new int[100];
        int index = 0;
        while (index < nums.length) {
            nums[index] = (int) Math.round(Math.random() * 100);
            index = index + 1;
        }
        for (int j = 0; j < nums.length; j = j + 1) {
            if (nums[j] % 2 == 0) {
                System.out.println("nums[" + j + "] = " + nums[j] + " - чётное");
            } else {
                System.out.println("nums[" + j + "] = " + nums[j] + " - нечётное");
                // берём число из массива
                // определяем чётное оно или нет
                // если число чётное, выводим его в консоль с надписью "чётное"
                // иначе число нечётное, выводим в вконсоль надпись "нечётное"
            }
        }
    }
}