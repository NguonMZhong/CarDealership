package org.yearup;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DealershipFileManager
{
    private String filePath;
    public DealershipFileManager(String filePath)
    {
     this.filePath = filePath;
    }
    public Dealership getDealership()
    {

        String dealerName = "";
        String address = "";
        String phone = "";

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
                int vin = Integer.parseInt(columns[0]);
                int year = Integer.parseInt(columns[1]);
                String make = columns[2];
                String vehicleType = columns[3];
                String color = columns[4];
                int odometer = Integer.parseInt(columns[5]);
                double price = Double.parseDouble(columns[6]);

                var vehicle = new Vehicle(vin, year, make, vehicleType, color, odometer, price);

                inventory.add(vehicle);

            }

        } catch (IOException e)
        {
        }
        var dealership = new Dealership(dealerName,address,phone);

        return dealership;

    }

    public void saveDealership()
    {
        //dont add any code to this
    }
}
