public class Person {

    String name;
    String gender;
    String color;
    int age;

    public void walk() {
        System.out.println(name + " is walking");
    }

    public void talk(Person person) {
        System.out.println(name + " and " + person.name + " are talking");
    }

    public void changeGender(String newGender) {
        gender = newGender;
    }
}

