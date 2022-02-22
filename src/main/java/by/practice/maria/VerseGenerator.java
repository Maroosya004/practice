package by.practice.maria;

import java.util.Random;

public class VerseGenerator {

    public static void main(String[] args) {
        String[] firstColumn = new String[]{"я помню", "не помню", "забыть бы", "купите", "очкуешь", "какое", "угробил",
                "хреново", "открою", "ты чуешь?"};
        String[] secondColumn = new String[]{"чудесное", "странное", "некое", "вкусное", "пьяное", "свинское",
                "чоткое", "сраное", "нужное", "конское"};
        String[] thirdColumn = new String[]{"мгновенье", "затменье", "хотенье", "варенье", "творенье", "везенье",
                "рожденье", "смущенье", "печенье", "ученье"};
        String[] fourthColumn = new String[]{"передо мной", "под косячком", "на кладбище", "в моих мечтах",
                "под скальпилем", "в моих штанах", "из-за угла", "в моих ушах", "в ночном горшке", "из головы"};
        Random random = new Random();
        int firstColumnIndex = random.nextInt(firstColumn.length);
        int secondColumnIndex = random.nextInt(firstColumn.length);
        int thirdColumnIndex = random.nextInt(firstColumn.length);
        int fourthColumnIndex = random.nextInt(firstColumn.length);
        String firstColumnString = firstColumn[firstColumnIndex];
        String secondColumnString = secondColumn[secondColumnIndex];
        String thirdColumnString = thirdColumn[thirdColumnIndex];
        String fourthColumnString = fourthColumn[fourthColumnIndex];
        System.out.println(firstColumnString + " " + secondColumnString + " " + thirdColumnString + " " + fourthColumnString);
   }
}
