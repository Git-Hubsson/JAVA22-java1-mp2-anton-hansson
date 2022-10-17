class Groceries {
    private String name;
    private int price;
    private int saldo;

    Groceries(String name, int price, int saldo) {
        this.name = name;
        this.price = price;
        this.saldo = saldo;
    }

    String getName() {
        return name;
    }

    int getPrice() {
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