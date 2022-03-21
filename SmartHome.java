package SmartHomeSystem;

import java.util.Locale;
import java.util.Scanner;

public class SmartHome implements Kitchen{

    public static void homeScreen(){

        System.out.println("///////////////////////////////////////");
        System.out.println("////      (Home Screen)            ////");
        System.out.println("////    Choose an Action:          ////");
        System.out.println("////      (1) Speaker              ////");
        System.out.println("////      (2) Front Door           ////");
        System.out.println("////      (3) Alarm                ////");
        System.out.println("////      (4) Lights               ////");
        System.out.println("////      (5) Thermostat           ////");
        System.out.println("////      (6) Garage Door          ////");
        System.out.println("////      (7) Kitchen Appliances   ////");
        System.out.println("////      (8) Bathroom Appliances   ////");
        System.out.println("///////////////////////////////////////");

    }

    public static void chooseAction(){
        Scanner scanner = new Scanner(System.in);
        homeScreen();
        String action = scanner.next();
        switch(action) {
            case "1":
                controlSpeakers();
                break;
            case "2":
                controlFrontDoor();
                break;
            case "3":
                controlAlarm();
                break;
            case "4":
                controlLights();
                break;
            case "5":
                controlThermostat();
                break;
            case "6":
                controlGarageDoor();
                break;
            case "7":
                controlKitchen();
                break;
            case "8":
                controlBathroom();
                break;
            default:
                System.out.println("///////////////////////////////////////////");
                System.out.println("////             (ERROR)              ////");
                System.out.println("////       Action not available       ////");
                System.out.println("////   Please Return to Home Screen   ////");
                System.out.println("//////////////////////////////////////////");
                System.out.println();
                chooseAction();
                break;
        }
    }

    public static void accessSmartHome() {
        Scanner scanner = new Scanner(System.in);

        final String username = "dylan burns";
        final int password = 55374420;

        System.out.println("Enter Username:");
        String usernameInput = scanner.nextLine().toLowerCase(Locale.ROOT);


        System.out.println("Enter password: ");
        int passwordInput = scanner.nextInt();

        if (passwordInput == password && usernameInput.equals(username)) {
            chooseAction();
        } else {
            System.out.println("Incorrect username or password!");
            accessSmartHome();
        }
    }

    public static void controlSpeakers(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("(Speaker): (1) on - (2) off - (3) home");
        String speakerState = scanner.next();
        switch(speakerState){
            case "1":
                System.out.println("(Speaker): On");
                System.out.println("Choose Option:");
                System.out.println("(1) Home Screen");
                System.out.println("(2) Quit");
                String option = scanner.next();
                switch(option){
                    case "1":
                        chooseAction();
                        break;
                    case "2":
                        break;
                }
                break;
            case "2":
                System.out.println("(Speaker): Off");
                System.out.println("Choose Option:");
                System.out.println("(1) Home Screen");
                System.out.println("(2) Quit");
                option = scanner.next();
                switch(option){
                    case "1":
                        chooseAction();
                        break;
                    case "2":
                        break;
                }
                break;
            case "3":
                chooseAction();
                break;
        }
    }

    public static void controlFrontDoor(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("(Front Door): (1) lock - (2) unlock - (3) home");
        String frontDoorState = scanner.next();
        switch(frontDoorState) {
            case "1":
                System.out.println("(Front Door): Locked");
                System.out.println("Choose Option:");
                System.out.println("(1) Home Screen");
                System.out.println("(2) Quit");
                String option = scanner.next();
                switch (option) {
                    case "1":
                        chooseAction();
                        break;
                    case "2":
                        break;
                }
                break;
            case "2":
                System.out.println("(Front Door): Unlocked");
                System.out.println("Choose Option:");
                System.out.println("(1) Home Screen");
                System.out.println("(2) Quit");
                option = scanner.next();
                switch (option) {
                    case "1":
                        chooseAction();
                        break;
                    case "2":
                        break;
                }
                break;
            case "3":
                chooseAction();
                break;
        }
    }

    public static void controlAlarm(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("(Alarm): (1) on - (2) off - (3) home");
        String alarmState = scanner.next();
        switch(alarmState){
            case "1":
                System.out.println("(Alarm): On");
                System.out.println("Choose Option:");
                System.out.println("(1) Home Screen");
                System.out.println("(2) Quit");
                String option = scanner.next();
                switch(option){
                    case "1":
                        chooseAction();
                        break;
                    case "2":
                        break;
                }
                break;
            case "2":
                System.out.println("(Alarm): Off");
                System.out.println("Choose Option:");
                System.out.println("(1) Home Screen");
                System.out.println("(2) Quit");
                option = scanner.next();
                switch(option){
                    case "1":
                        chooseAction();
                        break;
                    case "2":
                        break;
                }
                break;
            case "3":
                chooseAction();
                break;
        }
    }

    public static void controlLights(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("(Lights): (1) on - (2) off - (3) home");
        String lightState = scanner.next();
        switch(lightState){
            case "1":
                System.out.println("(Lights): On");
                System.out.println("Choose Option:");
                System.out.println("(1) Home Screen");
                System.out.println("(2) Quit");
                String option = scanner.next();
                switch(option){
                    case "1":
                        chooseAction();
                        break;
                    case "2":
                        break;
                }
                break;
            case "2":
                System.out.println("(Lights): Off");
                System.out.println("Choose Option:");
                System.out.println("(1) Home Screen");
                System.out.println("(2) Quit");
                option = scanner.next();
                switch(option){
                    case "1":
                        chooseAction();
                        break;
                    case "2":
                        break;
                }
                break;
            case "3":
                chooseAction();
                break;
        }
    }

    public static void controlThermostat(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("(Thermostat): (1)  on - (2) off - (3) home");
        String thermostatState = scanner.next();
        switch(thermostatState){
            case "1":
                System.out.println("(Thermostat): On");
                System.out.println("(Choose Mode): (1) heat - (2) ac - (3) fan - (4) home");
                String thermostatMode = scanner.next();
                switch (thermostatMode){
                    case "1":
                        System.out.println("(Thermostat): Heat on");
                        System.out.println("Choose Option:");
                        System.out.println("(1) Home Screen");
                        System.out.println("(2) Quit");
                        String option = scanner.next();
                        switch(option){
                            case "1":
                                chooseAction();
                                break;
                            case "2":
                                break;
                        }
                        break;
                    case "2":
                        System.out.println("(Thermostat): AC on");
                        System.out.println("Choose Option:");
                        System.out.println("(1) Home Screen");
                        System.out.println("(2) Quit");
                        option = scanner.next();
                        switch(option){
                            case "1":
                                chooseAction();
                                break;
                            case "2":
                                break;
                        }
                        break;
                    case "3":
                        System.out.println("(Thermostat): Fan on");
                        System.out.println("Choose Option:");
                        System.out.println("(1) Home Screen");
                        System.out.println("(2) Quit");
                        option = scanner.next();
                        switch(option){
                            case "1":
                                chooseAction();
                                break;
                            case "2":
                                break;
                        }
                        break;
                    case "4":
                        chooseAction();
                        break;
                    default:
                        System.out.println("Invalid input");

                }
                break;

            case "2":
                System.out.println("(Thermostat): Off");
                System.out.println("Choose Option:");
                System.out.println("(1) Home Screen");
                System.out.println("(2) Quit");
                String option = scanner.next();
                switch(option){
                    case "1":
                        chooseAction();
                        break;
                    case "2":
                        break;
                }
                break;
            case "3":
                chooseAction();
                break;
        }

    }

    public static void controlGarageDoor(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("(Garage Door) open - close - home");
        String garageDoorState = scanner.next();
        switch(garageDoorState){
            case "open":
                System.out.println("(Garage Door): Open");
                System.out.println("(1) Home Screen");
                System.out.println("(2) Quit");
                String option = scanner.next();
                switch(option){
                    case "1":
                        chooseAction();
                        break;
                    case "2":
                        break;
                }
                break;
            case "close":
                System.out.println("(Garage Door): Closed");
                System.out.println("(1) Home Screen");
                System.out.println("(2) Quit");
                option = scanner.next();
                switch(option){
                    case "1":
                        chooseAction();
                        break;
                    case "2":
                        break;
                }
                break;
            case "home":
                chooseAction();
                break;
        }
    }

    public static void controlKitchen() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("    (Kitchen)   ");
        System.out.println("Choose Appliance");
        System.out.println("(1) Coffee Machine"); //link coffeeMachine program / espresso - latte - cappuccino
        System.out.println("(2) Refrigerator");//make ice / dispense water-dispense ice / temperature
        System.out.println("(3) Oven");//preheat - broil - bake - set temp
        System.out.println("(4) Dish Washer");//load - run - unload
        System.out.println("(5) Sink");//hot-cold-warm - drain - garbage disposal
        System.out.println("(6) Trash");//compact trash() // isFull() - isEmpty() // recycle() - compost() / takeout()
        String appliance = scanner.next();
        switch(appliance){
            case "1":
                controlCoffeeMachine();
                break;
            case "2":
                controlRefrigerator();
                break;
            case "3":
                controlOven();
                break;
            case "4":
                controlDishWasher();
                break;
            case "5":
                controlKitchenSink();
                break;
            case "6":
                controlTrash();
                break;
        }

    }

    public static void controlCoffeeMachine(){
        System.out.println("Disconnected");
    }

    public static void controlRefrigerator(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("(Refrigerator):");
        System.out.println("Choose Action");
        System.out.println("(1) Ice Machine"); //cubed - spherical - normal
        System.out.println("(2) Dispenser");//quantity (ounces) / hot - cold
        System.out.println("(3) Temperature");//fridge - freezer
        String action = scanner.next();
        switch(action){
            case "1":
                controlIceMachine();
                break;
            case "2":
                controlDispenser();
                break;
            case "3":
                controlTemperature();
                break;
        }
    }

    public static void controlIceMachine(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("(Refrigerator): (Ice Machine):");
        System.out.println("Choose type of ice to make");
        System.out.println("(1) cubed");
        System.out.println("(2) spherical");
        System.out.println("(3) normal");
        String ice = scanner.next();
        switch(ice){
            case "1":
                System.out.println("(Refrigerator):(Ice Machine): making cubed ice");
                break;
            case "2":
                System.out.println("(Refrigerator):(Ice Machine): making spherical ice");
                break;
            case "3":
                System.out.println("(Refrigerator):(Ice Machine): making normal ice");
                break;
        }
    }

    public static void controlDispenser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("(Refrigerator):(Dispenser)");
        System.out.println("Choose Action");
        System.out.println("(1) Dispense Water");
        System.out.println("(2) Dispense Ice");
        String action = scanner.next();
        switch(action) {
            case "1":
                controlDispenseWater();
                break;
            case "2":
                controlDispenseIce();
                break;
        }
    }

    public static void controlDispenseIce(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("(Refrigerator):(Dispenser):(Ice):");
        System.out.println("Choose type of ice to dispense");
        System.out.println("(1) cubed");
        System.out.println("(2) spherical");
        System.out.println("(3) normal");
        System.out.println("(4) crushed");
        String iceShape = scanner.next();
        switch (iceShape) {
            case "1":
                System.out.println("(Refrigerator):(Dispenser):(Ice):(Shape): dispensing cubed ice");
                break;
            case "2":
                System.out.println("(Refrigerator):(Dispenser):(Ice):(Shape): dispensing spherical ice");
                break;
            case "3":
                System.out.println("(Refrigerator):(Dispenser):(Ice):(Shape): dispensing normal ice");
                break;
            case "4":
                System.out.println("(Dispenser):(Ice):(Shape): Choose crushed ice size");
                System.out.println("(1) small");
                System.out.println("(2) medium");
                System.out.println("(3) large");
                String sizeCrushedIce = scanner.next();
                switch (sizeCrushedIce) {
                    case "1":
                        System.out.println("(Dispenser):(Ice):(Shape):  dispensing small crushed ice");
                        break;
                    case "2":
                        System.out.println("(Dispenser):(Ice):(Shape):  dispensing medium crushed ice");
                        break;
                    case "3":
                        System.out.println("(Dispenser):(Ice):(Shape):  dispensing large crushed ice");
                        break;
                }
                break;
        }
    } 

    public static void controlDispenseWater() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("(Refrigerator):(Dispenser):(Water):");
        System.out.println("Choose Water Temperature: (1) cold (2) hot");
        String tempWater = scanner.next();
        System.out.println("Enter Quantity (in ounces)");
        String quantity = scanner.next();
        switch (tempWater) {
            case "1":
                System.out.println("(Refrigerator):(Dispenser):(Water): dispensing " + quantity + " ounces of cold water");
                break;
            case "2":
                System.out.println("(Refrigerator):(Dispenser):(Water): dispensing " + quantity + " ounces of hot water");
                break;
        }
    }

    public static void controlTemperature(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("(Refrigerator):(Temperature):");
        System.out.println("Choose Action: (1) Refrigerator Temperature - (2) Freezer Temperature");
        String option = scanner.next();
        switch(option){
            case "1":
                System.out.println("(Refrigerator):(Temperature): Enter Refrigerator temperature (Fahrenheit)");
                int refrigeratorTemp = scanner.nextInt();
                System.out.println("(Refrigerator):(Temperature): Refrigerator temperature is now set to " + refrigeratorTemp);
                break;
            case "2":
                System.out.println("(Refrigerator):(Temperature): Enter Freezer temperature (Fahrenheit)");
                int freezerTemp = scanner.nextInt();
                System.out.println("(Refrigerator):(Temperature): Freezer temperature is now set to " + freezerTemp);
                break;
        }
    }


    public static void controlOven() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("(Oven):");
        System.out.println("Choose Option: (1) Broil - (2) Bake - (3) Timer - (4) Cancel");
        String option = scanner.next();
        switch (option) {
            case "1":
                controlBroil();
                break;
            case "2":
                controlBake();
                break;
            case "3":
                controlTimer();
                break;
            case "4":
                cancel();
                break;
        }
    }

    public static void controlBroil(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("(Oven):(Broil):");
        System.out.println("Choose Option: (1) High - (2) Low");
        String option = scanner.next();
        switch(option){
            case "1":
                System.out.println("(Oven):(Broil): Broil set to high");
                break;
            case "2":
                System.out.println("(Oven):(Broil): Broil set to low");
                break;
        }
    }
    public static void controlBake(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("(Oven):(Bake):");
        System.out.println("Choose Option: (1) Preheat - (2) Set Temperature (3) Cancel");
         String option = scanner.next();
        switch(option) {
            case "1":
                System.out.println("(Oven):(Bake): Enter Preheat Temperature");
                int ovenPreheat = scanner.nextInt();
                System.out.println("Oven is Preheating to " + ovenPreheat + " degrees");
                break;
            case "2":
                System.out.println("(Oven):(Bake): What would you like to set the Oven Temperature at?");
                int ovenTemp = scanner.nextInt();
                System.out.println("Oven Temperature is set to " + ovenTemp + " degrees");
                break;
        }
    }

    public static void controlTimer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("(Oven):(Timer): Set Timer");
        System.out.println("Enter Hour(s): ");
        double ovenTimerHours = scanner.nextDouble();
        System.out.println("Enter Minute(s): ");
        double ovenTimerMinutes = scanner.nextDouble();
        System.out.println("(Oven):(Timer): Timer is set for " + ovenTimerHours + " hour(s) and " + ovenTimerMinutes + " minute(s)");
    }

    public static void cancel(){
        System.out.println("Oven operation cancelled");
    }

    public static void controlDishWasher(){
        Scanner scanner = new Scanner(System.in);
    }

    public static void controlKitchenSink(){
        Scanner scanner = new Scanner(System.in);
    }

    public static void controlTrash(){
        Scanner scanner = new Scanner(System.in);
    }


    public static void controlBathroom(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("    (Bathroom)   ");
        System.out.println("Choose Appliance");
        System.out.println("(1) Shower"); //hot-cold-warm / water pressure / steam-air dry / faucet modes
        System.out.println("(2) Toilet");
        System.out.println("(3) Fan");
        System.out.println("(3) Sink");//hot-cold-warm - drain - garbage disposal
    }

    public static void controlShower(){

    }

    public static void controlToilet(){

    }

    public static void controlFan(){

    }

    public static void controlBathroomSink(){}

























}
