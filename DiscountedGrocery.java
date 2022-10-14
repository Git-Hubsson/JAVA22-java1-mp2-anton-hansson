public class DiscountedGrocery extends Groceries {
    private double discountInPercent;
    DiscountedGrocery(String name, int price, int saldo, double discountInPercent) {
        super(name, price, saldo);
        this.discountInPercent = discountInPercent;
    }
    public double getDiscountInPercent() {
        return discountInPercent;
    }
    double newPrice() {
        return getPrice() * (discountInPercent / 100);
    }
    public void soldOut() {
        discountInPercent = 0;
        newPrice();
    }
}