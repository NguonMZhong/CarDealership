package org.yearup;

public class Vehicle
{
    //This will hold information about specific vehicle (data model)
    //variables
    private int vin;
    private int year;
    private String makeAndModel;
    private String vehicleType; //car, truck, etc..
    private String color;
    private int odometer;
    private double price;

    public Vehicle (int vin, int year, String makeAndModel,String vehicleType, String color, int odometer, double price)
    {
        this.vin = vin;
        this.year = year;
        this.makeAndModel = makeAndModel;
        this.vehicleType = vehicleType;
        this.color = color;
        this.odometer = odometer;
        this.price = price;
    }

    public int getVin()
    {
        return vin;
    }

    public void setVin(int vin)
    {
        this.vin = vin;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public String getMakeAndModel()
    {
        return makeAndModel;
    }

    public void setMakeAndModel(String make)
    {
        this.makeAndModel = makeAndModel;
    }

    public String getVehicleType()
    {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType)
    {
        this.vehicleType = vehicleType;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public int getOdometer()
    {
        return odometer;
    }

    public void setOdometer(int odometer)
    {
        this.odometer = odometer;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }
    @Override
    public String toString() {
        return String.format("%d|%d|%s|%s|%s|%d|%.2f",vin,year,makeAndModel,vehicleType,color,odometer,price);

    }

}
