class Groceries {
    private String name;
    private double price;
    private int saldo;

    Groceries(String name, double price, int saldo) {
        this.name = name;
        this.price = price;
        this.saldo = saldo;
    }

    String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }

    int getSaldo() {
        return saldo;
    }

    void setSaldo() {
        this.saldo--;
        if (saldo < 0) {
            saldo = 0;
        }
    }
}