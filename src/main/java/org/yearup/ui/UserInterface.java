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


    private DealershipFileManager fileManager = new DealershipFileManager("data\\inventory.csv");
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



    }
    private void processGetByMakeModelRequest()
    {

    }
    private void processGetByYearRequest()
    {

    }
    private void processGetByColorRequest()
    {

    }
    private void processGetByMileageRequest()
    {

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
