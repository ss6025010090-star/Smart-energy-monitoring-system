package model;

public class AirConditioner extends Equipment{

    private double temperature;

    public AirConditioner(int id, String name, double energyConsumption, double temperature) {
        super(id, name, energyConsumption);
        this.temperature = temperature;
    }

    public AirConditioner(int id, String name, double energyConsumption) {
        super(id, name, energyConsumption);
        this.temperature = 25;
    }

    public double getTemperature() {
        return temperature;
    }

    @Override
    public String getEquipmentType() {
        return "AirConditioner";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();

        System.out.println(
            
            " | Temperature: " + temperature + "°C"
        );
    }
    
}
