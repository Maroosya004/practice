public class Example {
    public static void main(String[] args) {
        String[] names = new String[] {"a", "b", "c", "d", "e"};
        int i = names.length-1;
        while (i>=0) { // Условие выполнения цикла
            String currentValue = names[i]; // Создать переменную с типом String и названием currentValue
            // Присвоить в переменную currentValue значение полученное из массива names
            // Example: String currentValue = names[1] -> String currentValue = b"
            // System.out.println(currentValue) -> System.out.println("b")
            System.out.println(currentValue); // Вывод в консоль переменной currentValue
            i = i-1; // Изменение значения переменной "i"
        }
    }
}

