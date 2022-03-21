package machine;
import java.util.Scanner;

//the purpose of this application is to design and implement structured code to a GUI
//that users can navigate with ease to connect and manipulate objects within their home.

//for now this is bare bones (just backend) with the intention of fully connecting this code
//to a GUI for real world application.
public class CoffeeMachine {
    final static Scanner scanner = new Scanner(System.in);

    private int water = 400;
    private int milk = 540;
    private int beans = 120;
    private int cups = 9;
    private int money = 550;

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.action();
    }

    public void state(){
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(beans + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println("$" + money + " of money");
    }

    public void action(){
        System.out.println("Write action (buy, fill, take, remaining , exit):");
        String action = scanner.next();
        switch(action){
            case "buy":
                buy();
                System.out.println();
                break;
            case "fill":
                System.out.println();
                fill();
                break;
            case "take":
                System.out.println();
                take();
                break;
            case "remaining":
                System.out.println();
                state();
                System.out.println();
                action();
                break;
            case "exit":
                break;
            default:
                System.out.println("Action cannot be taken");
                break;
        }
    }

    public void buy(){
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        String item = scanner.next();
        if (this.cups < 1) {
            System.out.println("Cannot make a cup of coffee, not enough disposable cups");
        }
        switch (item){
            case "1":
                //espresso - 250ml water, 16g beans, $4
                if (water < 250  || beans < 16) {
                    System.out.println("Cannot make a cup of coffee, not enough water in the machine to make a cappuccino");
                    break;
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    this.water -= 250;
                    this.beans -= 16;
                    this.money += 4; //add $4
                    this.cups --;
                }
                break;
            case "2":
                //latte - 350ml water, 75ml milk, 20g beans, $7
                if (water < 350 || milk < 75 || beans < 20) {
                    System.out.println("Cannot make a cup of coffee, not enough water in the machine to make a cappuccino");
                    break;
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    this.water -= 350;
                    this.milk -= 75;
                    this.beans -= 20;
                    this.money += 7; //add $7
                    this.cups --;
                }
                break;
            case "3":
                //cappuccino - 200ml water, 100ml milk, 12g beans, $6
                if (water < 200 || milk < 100 || beans < 12) {
                    System.out.println("Cannot make a cup of coffee, not enough water in the machine to make a cappuccino");
                    break;
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    this.water -= 200;
                    this.milk -= 100;
                    this.beans -= 12;
                    this.money += 6; //add $6
                    this.cups --;
                }
                break;
            case "back":

                break;
            default:
                System.out.println("Cannot take the action given by user");
                break;
        }

        action();
    }

    public void fill(){
        System.out.println("Write how many ml of water you want to add:");
        int addWater = scanner.nextInt();
        this.water += addWater;
        System.out.println("Write how many ml of milk you want to add:");
        int addMilk = scanner.nextInt();
        this.milk += addMilk;
        System.out.println("Write how many grams of coffee beans you want to add:");
        int addBeans = scanner.nextInt();;
        this.beans += addBeans;
        System.out.println("Write how many disposable cups of coffee you want to add:");
        int addCups = scanner.nextInt();
        this.cups += addCups;

        action();
    }

    public void take(){
        System.out.println("I gave you $" + this.money);
        this.money -= money;

        action();
    }
}