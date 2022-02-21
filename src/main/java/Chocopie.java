public class Chocopie {
    private String brand;
    private String colour;
    private int weight;
    private int height;
    private int width;

    public Chocopie(String brand, String colour, int weight, int height, int width) {
        this.brand = brand;
        this.colour = colour;
        this.weight = weight;
        this.height = height;
        this.width = width;
    }

    public String getColour() {
        return colour;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSize() {
        return height * width;
    }
}



