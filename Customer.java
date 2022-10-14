public class Customer {
    private static int groceriesBought;
    private static double moneySpent;

    Customer(int groceriesBought, int moneySpent) {
        this.groceriesBought = groceriesBought;
        this.moneySpent = moneySpent;
    }

    int getGroceriesBought(){
        return groceriesBought;
    }

    double getMoneySpent(){
        return moneySpent;
    }

    void setGroceriesBought() {
        this.groceriesBought ++;
    }

    void setMoneySpent(double price) {
        this.moneySpent +=price;
    }


}
