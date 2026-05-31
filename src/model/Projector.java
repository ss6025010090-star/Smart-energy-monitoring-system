package model;

public class Projector extends Equipment {
    private String resolution;
    private String projectorType;

    public Projector(int id, String name, double energyConsumption, String resolution, String projectorType) {
        super(id, name, energyConsumption);
        this.resolution = cleanText(resolution, "Unknown Resolution");
        this.projectorType = cleanText(projectorType, "Unknown Type");
    }

    public Projector(int id, String name, double energyConsumption) {
        super(id, name, energyConsumption);
        this.resolution = "1080p";
        this.projectorType = "LCD";
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
        return "Projector";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();

        System.out.println(
            
            " | Resolution: " + resolution +
            " | Projector Type: " + projectorType

        );
    }
}
