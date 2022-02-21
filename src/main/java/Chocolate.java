import java.math.BigDecimal;

public class Chocolate {
    private String brand;
    private BigDecimal price;

    public Chocolate(String brand, BigDecimal price) {
        this.brand = brand;
        this.price = price;
    }
    public String getBrand() {
        return brand;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
