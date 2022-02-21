import java.math.BigDecimal;

public class ShopLife {
    public static void main(String[] args) {
        Consumer consumer = new Consumer("Jessika", new Wallet(new BigDecimal("100")));
        Shop shop = new Shop();
        boolean walletIsFullOfMoney = true;
        int chocolatesNumber = 0;
        BigDecimal initialValue = consumer.getWallet().getTotal();
        while (walletIsFullOfMoney) {
            Chocolate chocolate = shop.sellChocolate(consumer.getWallet());
            if (chocolate != null) {
                chocolatesNumber++;
            } else {
                walletIsFullOfMoney = false;
            }
        }
        System.out.println("Managed to buy for " + initialValue + "$ " + chocolatesNumber + " chocolates, " +
                consumer.getWallet().getTotal() + "$ left in the wallet" );
    }
}
