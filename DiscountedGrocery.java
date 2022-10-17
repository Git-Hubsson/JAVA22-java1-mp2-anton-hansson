class DiscountedGrocery extends Groceries {
    private int discountInPercent;

    DiscountedGrocery(String name, int price, int saldo, int discountInPercent) {
        super(name, price, saldo);
        this.discountInPercent = discountInPercent;
    }

    int getDiscountInPercent() {
        if (discountInPercent < 0) {
            discountInPercent = 0;
        } else if (discountInPercent > 100) {
            discountInPercent = 100;
        }
        return discountInPercent;
    }

    double discountedPrice() {
        return getPrice() - (getPrice() * ((double) discountInPercent / 100));
    }
}