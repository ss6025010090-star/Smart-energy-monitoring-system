package model;

public class AirConditioner extends Equipment{

    private double temperature;

    public AirConditioner(int id, String name, double energyConsumption, double temperature) {
        super(id, name, energyConsumption);
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    @Override
    public void displayInfo() {
        System.out.println(
            "Equipment ID: " + id +
            " | Type: AirConditioner" +
            " | Name: " + name +
            " | Consumption: " + energyConsumption + " W" +
            " | Temperature: " + temperature + "°C"
        );
    }
    
}
