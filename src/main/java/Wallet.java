import java.math.BigDecimal;

public class Wallet {
    private BigDecimal total;
    public Wallet(BigDecimal total) {
        this.total = total;
    }
    public BigDecimal getTotal() {
        return total;
    }
    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
