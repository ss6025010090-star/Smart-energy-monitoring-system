package model;

public class Projector extends Equipment {
    private String resolution;
    private String projectorType;

    public Projector(int id, String name, double energyConsumption, String resolution, String projectorType) {
        super(id, name, energyConsumption);
        this.resolution = cleanText(resolution, "Unknown Resolution");
        this.projectorType = cleanText(projectorType, "Unknown Type");
    }

    public String getResolution() {
        return resolution;
    }

    public String getProjectorType() {
        return projectorType;
    }
    
    public void setResolution(String resolution) {
        if (resolution != null && !resolution.trim().isEmpty()) {
            this.resolution = resolution.trim();
        }
    }

    public void setProjectorType(String projectorType) {
        if (projectorType != null && !projectorType.trim().isEmpty()) {
            this.projectorType = projectorType.trim();
        }
    }

    @Override
    public String getEquipmentType() {
        return "projector";
    }

    @Override
    public void displayInfo() {
        System.out.println(
            "Equipment ID: " + id +
            " | Type: " + getEquipmentType() +
            " | Name: " + name +
            " | Expected Consumption: " + energyConsumption + " kWh" +
            " | Resolution: " + resolution +
            " | Projector Type: " + projectorType
        );
    }
}
