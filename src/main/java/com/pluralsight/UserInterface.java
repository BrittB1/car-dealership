package com.pluralsight;

import java.util.Scanner;

public class UserInterface {

    private void init() {
        DealershipFileManager manager = new DealershipFileManager();
        this.dealership = manager.getDealership();
    }

    private Dealership dealership;
    private Scanner keyboard = null;

    private boolean showHomeScreen() {
        init();

        boolean running = true;
        keyboard = new Scanner(System.in);

        while (running) {
            showHomeScreen();

            System.out.println("""
                     ╔════════════════════════════════════╗
                     ║         🏠 HOME SCREEN             ║
                     ╠════════════════════════════════════╣
                     ║ Welcome! What do you want to do ?  ║
                     ║   Choose an option by number:      ║
                     ║                                    ║
                     ║        Find a vehicle by:          ║
                     ║                                    ║
                     ║  1. 📋 PRICE RANGE                 ║
                     ║  2. 💰 MAKE/MODEL                  ║
                     ║  3. 💸 YEAR RANGE                  ║
                     ║  4. 📈 COLOR                       ║
                     ║  5. 🏠 MILEAGE                     ║
                     ║  6. 💰 TYPE                        ║
                     ║                                    ║
                     ║       + Other Options +            ║
                     ║                                    ║
                     ║  7. 📋 SHOW ALL VEHICLES           ║
                     ║  8. 💸 Add a Vehicle               ║
                     ║  9. 📈 Remove a Vehicle            ║
                     ║  0. 🚪 EXIT                        ║
                     ╚════════════════════════════════════╝
                    \s""");

            int selection = keyboard.nextInt();

            switch (selection) {

                case 1:
                    dealership.getVehiclesByPrice(min,max);
                    break;

                case 2:
                    dealership.getVehiclesByMakeModel(make,model);
                    break;

                case 3:
                    dealership.getVehiclesByYear(min,max);
                    break;

                case 4:
                    dealership.getVehiclesByColor();
                    break;
                case 5:
                    dealership.getVehiclesByMileage(min,max);
                    break;
                case 6:
                    dealership.getVehiclesByType(type);
                    break;
                case 7:
                    dealership.getAllVehicles();
                    break;
                case 8:
                    dealership.removeVehicle();
                    break;
                case 9:
                    dealership.addVehicle();;
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("❌ Sorry invalid option. Please try again");

            }
        }
    }
}
