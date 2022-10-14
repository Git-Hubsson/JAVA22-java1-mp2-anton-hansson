public class Groceries {
    private String name;
    private int price;
    private int saldo;

    Groceries(String name, int price, int saldo) {
        this.name = name;
        this.price = price;
        this.saldo = saldo;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setSaldo() {
        this.saldo--;
        if (saldo < 0) {
            saldo = 0;
        }
    }
}