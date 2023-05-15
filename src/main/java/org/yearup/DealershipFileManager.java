package org.yearup;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class DealershipFileManager
{
    private String filePath;
    public DealershipFileManager(String filePath)
    {
     this.filePath = filePath;
    }
    public Dealership getDealership()
    {

        String dealerName = null;
        String address = null;
        String phone = null;

        ArrayList<Vehicle> inventory = new ArrayList<>();

        try (FileReader reader = new FileReader(this.filePath);
        Scanner scanner = new Scanner(reader);)

        {
            String firstLine = scanner.nextLine();
            // get the dealer info from the first line
            String[] columnHeaders = firstLine.split("\\|");
            dealerName = columnHeaders[0];
            address = columnHeaders[1];
            phone = columnHeaders[2];

            while (scanner.hasNext())
            {

                String line = scanner.nextLine();
                String[] columns = line.split("\\|");
                int vin = parseInt(columns[0]);
                int year = parseInt(columns[1]);
                String makeAndModel = columns[2] + " " + columns[3];
                String vehicleType = columns[4];
                String color = columns[5];
                int odometer = parseInt(columns[6]);
                double price = Double.parseDouble(columns[7]);

                var vehicle = new Vehicle(vin, year, makeAndModel, vehicleType, color, odometer, price);

                inventory.add(vehicle);

            }

        } catch (IOException e)
        {

        }
        var dealership = new Dealership(dealerName,address,phone);
        dealership.setInventory(inventory);

        return dealership;

    }

    public void saveDealership()
    {
        //dont add any code to this
    }
}
