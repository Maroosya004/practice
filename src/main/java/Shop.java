import java.math.BigDecimal;

public class Shop {
    public Chocolate sellChocolate(Wallet wallet) {
        BigDecimal currentTotal = wallet.getTotal();
        Chocolate chocolate = new Chocolate("Milka", new BigDecimal("10.99"));
        if (currentTotal.compareTo(chocolate.getPrice()) >= 0) {
            wallet.setTotal(currentTotal.subtract(chocolate.getPrice()));
            return chocolate;
        } else {
            return null;
        }
    }
}
