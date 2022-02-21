public class Consumer {
    private final String name;
    private Wallet wallet;

    public Consumer(String name, Wallet wallet) {
        this.name = name;
        this.wallet = wallet;
    }
    public String getName() {
        return name;
    }
    public Wallet getWallet() {
        return wallet;
    }
    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }
}
