package model;

public class Light extends Equipment {

    private int brightnessLevel;
    private String lightType;

    public Light(int id, String name, double energyConsumption, int brightnessLevel, String lightType) {
        super(id, name, energyConsumption);
        setBrightnessLevel(brightnessLevel);
        this.lightType = cleanText(lightType, "LED");
    }

    public int getBrightnessLevel() {
        return brightnessLevel;
    }
    
    public String getLightType() {
        return lightType;
    }

    public void setBrightnessLevel(int brightnessLevel) {
        if (brightnessLevel >= 0 && brightnessLevel <= 100) {
            this.brightnessLevel = brightnessLevel;
        } else {
            this.brightnessLevel = 50;
        }
    }

    public void setLightType(String lightType) {
        if (lightType != null && !lightType.trim().isEmpty()) {
            this.lightType = lightType.trim();
        }
    }

    @Override
    public String getEquipmentType() {
        return "Light";
    }

    @Override
    public void displayInfo() {
        System.out.println(
            "Equipment ID: " + id +
            " | Type: " + getEquipmentType() +
            " | Name: " + name +
            " | Expected Consumption: " + energyConsumption + " kWh" +
            " | Brightness: " + brightnessLevel + "%" +
            " | Light Type: " + lightType
        );
    }

}
