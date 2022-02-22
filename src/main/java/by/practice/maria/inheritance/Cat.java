package by.practice.maria.inheritance;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("Murr");
    }
}
