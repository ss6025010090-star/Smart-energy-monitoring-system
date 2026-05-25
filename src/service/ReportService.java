package service;

import java.util.List;
import model.EnergyReading;
import model.Room;

public class ReportService {

    public double calculateDailyUsage(Room room, String date, List<EnergyReading> readings) {
        double total = 0;

        for (EnergyReading reading : readings) {
            if (reading.getRoom().getNumber().equals(room.getNumber()) && reading.getDate().equals(date)) {
                total += reading.getKWh();
            }
        }
        
        return total;
    }

    public double calculateMonthlyUsage(Room room, String month, List<EnergyReading> readings) {
        double total = 0;

        for (EnergyReading reading : readings) {
            if (reading.getRoom().getNumber().equals(room.getNumber()) && reading.getDate().startsWith(month)) {
                total += reading.getKWh();
            }
        }
        return total;
    }

    public double calculateTotalUsage(List<EnergyReading> readings) {
        double total = 0;

        for (EnergyReading reading : readings) {
            total += reading.getKWh();
        }

        return total;
    }
    
}
