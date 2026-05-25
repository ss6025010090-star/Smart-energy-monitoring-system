package main;

import java.util.ArrayList;
import java.util.List;
import database.DatabaseManager;
import gui.DashboardGUI;
import model.Room;
import model.EnergyReading;
import model.Equipment;
import model.Light;
import model.Projector;
import model.AirConditioner;

import service.ReportService;
import service.BillService;

public class MainProgram {
    public static void main(String[] args) {


        //load data from database
        DatabaseManager db = new DatabaseManager();

        List<Room> rooms = db.getAllRooms();
        List<EnergyReading> readings = db.getAllReadings();

        //show dashboard
        DashboardGUI dashboard = new DashboardGUI(readings);
        dashboard.show();

        //service
        ReportService reportService = new ReportService();
        BillService billService = new BillService();


        //choose room
        Room room406 = rooms.get(0);

        //calculate usage
        double dailyUsage = reportService.calculateDailyUsage(room406, "2026-04-25", readings);
        double monthlyUsage = reportService.calculateMonthlyUsage(room406, "2026-04", readings);
        double totalBill = billService.calculateTotalBill(monthlyUsage);

        //display room information
        room406.displayInfo();

        //output
        System.out.println("Daily Usage: " + dailyUsage + " KWh");
        System.out.println("Monthly Usage: " + monthlyUsage + " KWh");
        System.out.println("Total Bill: $" + totalBill);


        //inheritance
        System.out.println("\n Equipment inheritance ");

        List<Equipment> testEquipment = new ArrayList<>();

        testEquipment.add(new Light(1, "Front Light", 50, 80, "LED"));
        testEquipment.add(new AirConditioner(2, "Ductless AC", 1500, 18));
        testEquipment.add(new Projector(3, "Class Projector", 300, "1080p", "LCD"));

        for (Equipment e : testEquipment) {
            e.displayInfo();
        }

    }
}