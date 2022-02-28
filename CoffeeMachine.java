package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int water = 400;
        int milk = 540;
        int coffeeBeans = 120;
        int cups = 9;
        int money = 550;
        String options =" ";
        while (!options.equals("exit")){
            System.out.println("Write action (buy, fill, take, exit):");
            options = scanner.nextLine();
            if (options.equals("buy")){
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                int coffeeType = scanner.nextInt();
                switch (coffeeType){
                    case (1):
                        System.out.println("The coffee machine has:");
                        System.out.println(water - 250 + " ml of water");
                        System.out.println(milk + " ml of milk");
                        System.out.println(coffeeBeans - 16 + " g of coffee beans");
                        System.out.println(cups - 1 + " disposable cups");
                        System.out.println("$"+ money + 4 + " of money");
                        if (water <= 250) {
                            System.out.println("I can not serve you a espresso");
                        } else if (coffeeBeans <= 16) {
                            System.out.println("I can not serve you a espresso");
                        } else if (cups <= 1) {
                            System.out.println("I can not serve you a espresso");
                        }
                        break;
                    case (2):
                        System.out.println("The coffee machine has:");
                        System.out.println(water - 350 + " ml of water");
                        System.out.println(milk - 75 + " ml of milk");
                        System.out.println(coffeeBeans - 20 + " g of coffee beans");
                        System.out.println(cups - 1 + " disposable cups");
                        System.out.println("$"+ money + 7 + " of money");
                        if (water <= 350) {
                            System.out.println("I can not serve you a latte");
                        } else if (milk <= 75) {
                            System.out.println("I can not serve you a latte");
                        } else if (coffeeBeans <= 20) {
                            System.out.println("I can not serve you a latte");
                        } else if (cups <= 1) {
                            System.out.println("I can not serve you a latte");
                        }
                        break;
                    case (3):
                        System.out.println("The coffee machine has:");
                        System.out.println(water - 200 + " ml of water");
                        System.out.println(milk - 100 + " ml of milk");
                        System.out.println(coffeeBeans - 12 + " g of coffee beans");
                        System.out.println(cups - 1 + " disposable cups");
                        System.out.println("$"+ money + 6 + " of money");
                        if (water <= 200) {
                            System.out.println("I can not serve you a cappuccino");
                        } else if (milk <= 100) {
                            System.out.println("I can not serve you a cappuccino");
                        } else if (coffeeBeans <= 12) {
                            System.out.println("I can not serve you a cappuccino");
                        } else if (cups <= 1) {
                            System.out.println("I can not serve you a cappuccino");
                        }
                        break;

                }
            } else if (options.equals("fill")) {
                System.out.println("Write how many ml of water you want to add:");
                water += scanner.nextInt();
                System.out.println("Write how many ml of milk you want to add:");
                milk += scanner.nextInt();
                System.out.println("Write how many grams of coffee beans you want to add:");
                coffeeBeans += scanner.nextInt();
                System.out.println("Write how many disposable cups of coffee you want to add:");
                cups += scanner.nextInt();
                System.out.println("The coffee machine has:");
                System.out.println(water + " ml of water");
                System.out.println(milk + " ml of milk");
                System.out.println(coffeeBeans + " g of coffee beans");
                System.out.println(cups + " disposable cups");
                System.out.println("$" + money + " of money");
                break;
            } else if (options.equals("take")) {
                System.out.println("I gave you $" + money);
                money -= money;
                System.out.println("The coffee machine has:");
                System.out.println(water + " ml of water");
                System.out.println(milk + " ml of milk");
                System.out.println(coffeeBeans + " g of coffee beans");
                System.out.println(cups + " disposable cups");
                System.out.println("$" + money + " of money");
                break;
            }
        }
    }
}
