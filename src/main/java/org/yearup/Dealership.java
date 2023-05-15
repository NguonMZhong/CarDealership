package org.yearup;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Dealership
{
    private String name;
    private String address;
    private String phone;

    private ArrayList<Vehicle> inventory;

    //Constructor
    public Dealership(String name, String address, String phone)
    {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }
    //getter & setters
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    //search methods

    public ArrayList<Vehicle> getVehiclesByPrice(double min, double max)
    {
        ArrayList result = new ArrayList();
        for (Vehicle vehicle : inventory)
        {
            if (vehicle.getPrice() >= min && vehicle.getPrice() <= max)
            {
                result.add(vehicle);
            }
        }
        return result;
    }
    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model)
    {
        return null;
    }
    public ArrayList<Vehicle> getVehiclesByYear(double min, double max)
    {
        return null;
    }
    public ArrayList<Vehicle> getVehiclesByColor(String color)
    {
        return null;
    }
    public ArrayList<Vehicle> getVehiclesByMileage(double min, double max)
    {
        return null;
    }
    public ArrayList<Vehicle> getVehiclesByType(String vehicleType)
    {
        return null;
    }

    public ArrayList<Vehicle> getAllVehicles()
    {
        //show all inventory
        return this.inventory;
    }
    public void addVehicles(Vehicle vehicle)
    {
        this.inventory.add(vehicle);

    }
    public void removeVehicle(Vehicle vehicle)
    {
        //don't add code

    }
    public void setInventory(ArrayList<Vehicle> inventory) {
        this.inventory = inventory;
    }




}
