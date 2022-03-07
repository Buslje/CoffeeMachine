package machine;

import java.util.Scanner;

public class CoffeeMachine {
    static Scanner scanner = new Scanner(System.in);
    static int water = 400;
    static int milk = 540;
    static int coffeeBeans = 120;
    static int cups = 9;
    static int money = 550;
    static String options = " ";
    public static void main(String[] args) {

        while (!options.equals("exit")){

            System.out.println("Write action (buy, fill, take, remaining, exit):");
            options = scanner.nextLine();

            if (options.equals("buy")){
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                String coffeeType = scanner.nextLine();
                switch (coffeeType) {
                    case ("1"):
                        if (water < 250) {
                            System.out.println("Sorry, not enough water!");
                        } else if (coffeeBeans < 16) {
                            System.out.println("Sorry, not enough coffee beans!");
                        } else if (cups < 1) {
                            System.out.println("Sorry, not enough cups!");
                        } else if (water >= 250 && coffeeBeans >= 16 && cups >= 1) {

                            System.out.println("I have enough resources, making you a coffee!");
                            water -= 250;
                            milk -= 0;
                            coffeeBeans -= 16;
                            cups -= 1;
                            money += 4;
                        }
                        break;
                    case ("2"):
                        if (water < 350) {
                            System.out.println("Sorry, not enough water!");
                        } else if (milk < 75) {
                            System.out.println("Sorry, not enough milk!");
                        } else if (coffeeBeans < 20) {
                            System.out.println("Sorry, not enough coffee beans!");
                        } else if (cups < 1) {
                            System.out.println("Sorry, not enough cups!");
                        } else if (water >= 350 && milk >= 75 && coffeeBeans >= 20 && cups >= 1) {

                            System.out.println("I have enough resources, making you a coffee!");
                            water -= 350;
                            milk -= 75;
                            coffeeBeans -= 20;
                            cups -= 1;
                            money += 7;
                        }
                        break;
                    case ("3"):
                        if (water < 200) {
                            System.out.println("Sorry, not enough water!");
                        } else if (milk < 100) {
                            System.out.println("Sorry, not enough milk!");
                        } else if (coffeeBeans < 12) {
                            System.out.println("Sorry, not enough coffee beans!");
                        } else if (cups < 1) {
                            System.out.println("Sorry, not enough cups!");
                        } else if (water >= 200 && milk >= 100 && coffeeBeans >= 12 && cups >= 1) {

                            System.out.println("I have enough resources, making you a coffee!");
                            water -= 200;
                            milk -= 100;
                            coffeeBeans -= 12;
                            cups -= 1;
                            money += 6;

                        }
                        break;
                    case ("back"):
                        break;
                }

            } else if (options.equals("fill")) {
                fill();
            } else if (options.equals("take")) {
                take();
            } else if (options.equals("remaining")) {
                remaining();
            }

        }
    }

    public static void remaining() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffeeBeans + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println("$" + money + " of money");
    }
    public static void fill() {
        System.out.println("Write how many ml of water you want to add:");
        water += scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        milk += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        coffeeBeans += scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add:");
        cups += scanner.nextInt();
    }
    public static void take() {
        System.out.println("I gave you $" + money);
        money -= money;
    }
}
