import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DiscountedGrocery Pear = new DiscountedGrocery("Pear", 8, 8, 30);
        Groceries Apple = new Groceries("Apple", 4, 15);
        Groceries Avocado = new Groceries("Avocado", 15, 4);

        Customer Anton = new Customer();

        Scanner sc = new Scanner(System.in);
        int choice;
        boolean loop = true;
        while (loop) {
            if (Pear.getSaldo() > 0) {
                System.out.println("1. *!* Buy " + Pear.getName() + " and get " + Pear.getDiscountInPercent() + "% discount. Your price is " + Pear.discountedPrice() + " SEK per pear, only " + Pear.getSaldo() + " left *!*");
            } else {
                System.out.println("1. --Pears sold out--");
            }
            if (Apple.getSaldo() > 0) {
                System.out.println("2. Buy " + Apple.getName() + ", " + Apple.getPrice() + " SEK, " + Apple.getSaldo() + " left");
            } else {
                System.out.println("2. --Apples sold out--");
            }
            if (Avocado.getSaldo() > 0) {
                System.out.println("3. Buy " + Avocado.getName() + ", " + Avocado.getPrice() + " SEK, " + Avocado.getSaldo() + " left");
            } else {
                System.out.println("3. --Avocados sold out--");
            }
            System.out.println("4. Quit");
            choice = sc.next().charAt(0);

            switch (choice) {
                case '1':
                    if (Pear.getSaldo() > 0) {
                        Anton.setMoneySpent(Pear.discountedPrice());
                        Anton.setGroceriesBought();
                        Pear.setSaldo();
                    }
                    break;

                case '2':
                    if (Apple.getSaldo() > 0) {
                        Anton.setMoneySpent(Apple.getPrice());
                        Anton.setGroceriesBought();
                        Apple.setSaldo();
                    }
                    break;

                case '3':
                    if (Avocado.getSaldo() > 0) {
                        Anton.setMoneySpent(Avocado.getPrice());
                        Anton.setGroceriesBought();
                        Avocado.setSaldo();
                    }
                    break;

                case '4':
                    System.out.println("You purchased a total of " + Anton.getGroceriesBought() + " item(s). The total cost was " + Anton.getMoneySpent() + " SEK.");
                    loop = false;
                    break;

                default:
                    System.out.println("Please enter a number between 1-4.\n");
                    break;
            }
        }

    }
}
