package model;

import java.util.ArrayList;
import interfaces.Displayable;


public class EnergyReport implements Displayable {
    
    private int reportId;
    private Room room;
    private String reportType;
    private String period;
    private double totalKWh;
    private ArrayList<EnergyReading> readings;

    private static int count = 0;

    public EnergyReport(int reportId, Room room, String reportType, String perion, double totalKWh, ArrayList<EnergyReading> readings) {
        
        if (reportId > 0) {
            reportId = reportId;
        } else {
            reportId = 0;
        }

        this.reportId = reportId;
        this.room = room;
        
        reportType = cleanText(reportType, "General Report");
        this.reportType = reportType;

        period = cleanText(period, "No Period");
        this.period = period;

        if (totalKWh >= 0) {
            totalKWh = totalKWh;
        } else {
            totalKWh = 0;
        }
        this.totalKWh = totalKWh;


        this.readings = new ArrayList<>();

        if (readings != null) {
            this.readings.addAll(readings);
        }
        count++;
    }

    private String cleanText(String value, String defaultValue) {
        if (value == null || value.trim().isEmpty()) {
            return defaultValue;
        }
        return value.trim();
    }

    public int getReportId() {
        return reportId;
    }

    public Room getRoom() {
        return room;
    }

    public String getReportType() {
        return reportType;
    }

    public String getPeriod() {
        return period;
    }

    public double getTotalKWh() {
        return totalKWh;
    }

    public ArrayList<EnergyReading> getReadings() {
        return new ArrayList<>(readings);
    }

    public static int getCount() {
        return count;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void setReadings(ArrayList<EnergyReading> readings) {
        this.readings = readings;
    }


    @Override
    public void displayInfo() {
        System.out.println("\nEnergy Report");
        System.out.println("Report ID: " + reportId);
        System.out.println("Type: " + reportType);
        System.out.println("Period: " + period);

        if (room != null) {
            System.out.println("Room: " + room.getNumber());
        } else {
            System.out.println("Room: N/A");
        }

        System.out.println("Total kWh: " + totalKWh);
        System.out.println("Readings: " + readings.size());
    }

}  