package by.practice.maria;

public class Black {
    public static void main(String[] args) {
        Chocopie chocolate1 = new Chocopie("Alenka", "black", 100, 10, 5);
        Chocopie chocolate2 = new Chocopie("Nestle", "pink", 95, 9, 5);
        Chocopie chocolate3 = new Chocopie("Roshen", "white", 150, 14, 9);
        Chocopie chocolate4 = new Chocopie("Milka", "black", 500, 25, 7);
        chocolate4.getColour();
        chocolate1.setWeight(200);
        System.out.println(chocolate2.getColour());
        System.out.println(chocolate4.getSize());
    }
}
