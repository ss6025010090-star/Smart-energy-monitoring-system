package gui;
import java.util.List;


import model.EnergyReading;

public class DashboardGUI {
 
    private List<EnergyReading> readings;

    public DashboardGUI(List<EnergyReading> readings){
        this.readings = readings;
    }

    public void show() {
        System.out.println(" Energy Dashboard ");

        String currentRoom = "";
        
        for (EnergyReading r : readings) {

            if (!r.getRoom().getNumber().equals(currentRoom)) {

                currentRoom = r.getRoom().getNumber();
                System.out.println("Room " + currentRoom );
            }

            System.out.println(r.getDate() + " | " + r.getTime() + " | " + r.getKWh() + " kWh");
        }

        System.out.println("Total readings: " + EnergyReading.getCount());

    }

    public List<EnergyReading> getReadings() {
        return readings;
    }

    public void setReadings(List<EnergyReading> readings) {
        this.readings = readings;
    }

}
