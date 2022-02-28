import java.util.Scanner;
public class CoffeeMachine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffeeBeans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int cups = scanner.nextInt();
        int brojac = 0;
        int razlika = 0;
        while (water >= 200 && milk >= 50 && coffeeBeans >= 15) {
            brojac += 1;
            water -= 200;
            milk -= 50;
            coffeeBeans -= 15;
        }
        if (cups > brojac) {
            System.out.println("No, I can make only " + brojac + " cup(s) of coffee");
        } else if (brojac > cups) {
            razlika = brojac - cups;
            System.out.println("Yes, I can make that amount of coffee (and even " + razlika + " more than that)");
        } else {
            System.out.println("Yes, I can make that amount of coffee");
        }
    }
}

