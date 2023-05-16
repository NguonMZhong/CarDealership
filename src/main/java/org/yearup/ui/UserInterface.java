package org.yearup.ui;

import org.yearup.Dealership;
import org.yearup.DealershipFileManager;
import org.yearup.Vehicle;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface
{


    DealershipFileManager fileManager = new DealershipFileManager("data\\inventory.csv");
    private Dealership dealership;


    Scanner scanner = new Scanner(System.in);


    public UserInterface()
    {
        init();

    }
    private void init()
    {
        this.dealership = fileManager.getDealership();
    }
    public void display()
    {

        boolean exit = false;
        helperMenu();

        while (!exit)
        {
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option)
            {
                case 1:
                    processGetByPriceRequest();
                    break;
                case 2:
                    processGetByMakeModelRequest();
                    break;
                case 3:
                    processGetByYearRequest();
                    break;
                case 4:
                    processGetByColorRequest();
                    break;
                case 5:
                    processGetByMileageRequest();
                    break;
                case 6:
                    processGetByVehicleTypeRequest();
                    break;
                case 7:
                    processGetAllVehiclesRequest();
                    break;
                case 8:
                    processAddVehicleRequest();
                    break;
                case 9:
                    processRemoveVehicleRequest();
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Invaid option. Please try again.");
                    break;
            }
        }

    }
    private void helperMenu()
    {
        System.out.println("Please selection an option");
        System.out.println("-------------------------------");
        System.out.println("1) Search by price");
        System.out.println("2) Search by make model");
        System.out.println("3) Search by year");
        System.out.println("4) Search by color");
        System.out.println("5) Search by mileage");
        System.out.println("6) Search by type");
        System.out.println("7) View all vehicles");
        System.out.println("8) Add a new vehicles");
        System.out.println("9) Remove a vehicle");
        System.out.println("0) Exit");
        System.out.print("Enter: ");

    }
    private void displayVehicles(ArrayList<Vehicle> vehicles)
    {
        if (vehicles.isEmpty())
        {
            System.out.println("No vehicle found.");
        }
        else
        {
            for (Vehicle vehicle : vehicles)
            {
                System.out.println(vehicle);
            }
        }

    }
    private void processAllVehiclesRequest()
    {
        ArrayList<Vehicle> vehicles = dealership.getAllVehicles();
        displayVehicles(vehicles);
    }
    private void processGetByPriceRequest()
    {
        System.out.println();
        System.out.println("Enter the minimum price range: ");
        double minimum = scanner.nextDouble();


        System.out.println("Enter the maximum price range: ");
        double maximum = scanner.nextDouble();

        ArrayList<Vehicle> vehicles = dealership.getAllVehicles();
        ArrayList<Vehicle> vehiclesInRange = new ArrayList<>();

        for (Vehicle vehicle : vehicles)
        {
            if (vehicle.getPrice() >= minimum && vehicle.getPrice() <= maximum)
            {
                vehiclesInRange.add(vehicle);
            }
        }
        System.out.println();
        System.out.println("Here are vehicles that are within your price range.\n");
        displayVehicles(vehiclesInRange);
        System.out.println();
        helperMenu();



    }
    private void processGetByMakeModelRequest()
    {
        //make and model are concatenated need to get both of them
        System.out.println();
        System.out.println("Enter the make and model you wish to view.\n");
        System.out.print("Make: ");
        String make = scanner.nextLine();

        System.out.print("Model: ");
        String model = scanner.nextLine();

        ArrayList<Vehicle> vehicles = dealership.getVehiclesByMakeModel(make, model);
        System.out.println();
        System.out.println("Here is all vehicles with the make and model you searched for.");
        System.out.println();
        displayVehicles(vehicles);
        System.out.println();
        helperMenu();

    }
    private void processGetByYearRequest()
    {
        int min;
        int max;

        System.out.println();
        System.out.print("Enter the lowest year: ");
        min = scanner.nextInt();

        System.out.print("Enter the highest year: ");
        max = scanner.nextInt();

        ArrayList<Vehicle>vehicles = dealership.getVehiclesByYear(min, max);
        System.out.println();
        System.out.println("Here is a list of all vehicles with the minimum and maximum year you searched for.\n");
        displayVehicles(vehicles);
        System.out.println();
        helperMenu();

    }
    private void processGetByColorRequest()
    {
        System.out.println();
        System.out.println("Enter the color vehicles you wish to search for.\n");
        System.out.print("Color: ");
        String color = scanner.next();

        ArrayList<Vehicle>vehicles = dealership.getVehiclesByColor(color);

        System.out.println();
        System.out.println("Here is a list of all vehicles with the color you searched for.");
        System.out.println();
        displayVehicles(vehicles);
        helperMenu();
    }
    private void processGetByMileageRequest()
    {
        //why do I have to initialize my double variable but not my int variable?
        double min = 0.0;
        double max = 0.0;

        System.out.println();
        System.out.print("Enter the lowest mileage:");
        min = scanner.nextDouble();

        System.out.print("Enter the highest mileage: ");
        max = scanner.nextDouble();

        ArrayList<Vehicle>vehicles = dealership.getVehiclesByMileage(min,max);
        System.out.println();
        System.out.println("Here is a list of all vehicles within the mileage range you searched for.\n");
        displayVehicles(vehicles);
        System.out.println();
        helperMenu();

    }
    private void processGetByVehicleTypeRequest()
    {

    }
    private void processGetAllVehiclesRequest()
    {

    }
    private void processAddVehicleRequest()
    {

    }
    private void processRemoveVehicleRequest()
    {

    }

}
