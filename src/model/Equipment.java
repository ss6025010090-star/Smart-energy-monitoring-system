package model;

import interfaces.Displayable;


public class Equipment implements Displayable{
    
    protected int id;
    protected String name;
    protected double energyConsumption;

    public Equipment(int id, String name, double energyConsumption) {
        setId(id);
        setName(name);
        setEnergyConsumption(energyConsumption);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getEnergyConsumption() {
        return energyConsumption;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnergyConsumption(double energyConsumption) {
        if (energyConsumption >= 0) {
            this.energyConsumption = energyConsumption;
        }
    }

    protected String cleanText(String value, String defaultValue) {
        if (value == null || value.trim().isEmpty()) {
            return defaultValue;
        }
        return value.trim();
    }

    public String getEquipmentType() {
        return "Equipment";
    }

    @Override
    public void displayInfo() {
        System.out.println(
            "ID: " + id +
            " | Type: " + getEquipmentType() +
            " | Name: " + name +
            " | Consumption: " + energyConsumption + " W"
        );
    }


    

    @Override
    public String toString() {
        return id + " | " + name + " | " + energyConsumption + " W";
    }
}
