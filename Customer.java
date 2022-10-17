class Customer {
    private static int groceriesBought = 0;
    private static double moneySpent = 0;

    Customer() {
    }

    int getGroceriesBought() {
        return groceriesBought;
    }

    double getMoneySpent() {
        return moneySpent;
    }

    void setGroceriesBought() {
        this.groceriesBought++;
    }

    void setMoneySpent(double price) {
        this.moneySpent += price;
    }


}
