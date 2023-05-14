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


    public UserInterface()
    {
        init();

    }
    private void init()
    {
        DealershipFileManager dealershipFileManager = new DealershipFileManager();
        this.dealership = dealershipFileManager.getDealership();
    }
    public void display()
    {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit)
        {
            display();
            String command = scanner.nextLine();

            switch (command.toLowerCase())
            {
                case "price":
                    processGetByPriceRequest();
                    break;
                case "make model":
                    processGetByMakeModelRequest();
                    break;
                case "year":
                    processGetByYearRequest();
                    break;
                case "color":
                    processGetByColorRequest();
                    break;
                case "mileage":
                    processGetByMileageRequest();
                    break;
                case "type":
                    processGetByVehicleTypeRequest();
                    break;
                case "all":
                    processGetAllVehiclesRequest();
                    break;
                case "add":
                    processAddVehicleRequest();
                    break;
                case "remove":
                    processRemoveVehicleRequest();
                    break;
                case "exit":
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
        System.out.println("Search by price");
        System.out.println("Search by make model");
        System.out.println("Search by year");
        System.out.println("Search by color");
        System.out.println("Search by mileage");
        System.out.println("Search by type");
        System.out.println("View all vehicles");
        System.out.println("Add a new vehicles");
        System.out.println("Remove a vehicle");
        System.out.println("Exit");
    }
    private void displayVehicles(List<Vehicle> vehicles)
    {
        if (vehicles.isEmpty))
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
        List<Vehicle> vehicles = dealership.getAllVehicles();
        displayVehicles(vehicles);
    }
    private void processGetByPriceRequest()
    {

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
