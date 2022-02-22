package by.practice.maria.inheritance;

public class Animal {

    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public void voice() {
        System.err.println("Voice isn't detected");
    }

    public String getName() {
        return name;
    }
}
