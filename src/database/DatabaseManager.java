package database;

import java.util.ArrayList;
import java.util.List;

import model.Room;
import model.Equipment;
import model.Light;
import model.Projector;
import model.AirConditioner;
import model.EnergyReading;

public class DatabaseManager {

    private List<Room> rooms;

    public DatabaseManager() {
        rooms = generateRooms();
    }
 

    public List<Room> getAllRooms() {
        return rooms;
    }

    private List<Room> generateRooms() {
        
        List<Room> rooms = new ArrayList<>();
        
        //Room 406
        List<Equipment> room406 = new ArrayList<>();
        room406.add(new Light(1, "Front Light", 50, 80, "LED"));
        room406.add(new AirConditioner(2, "Ductless AC", 1500, 25));
        room406.add(new AirConditioner(3, "Cassette AC", 2000, 20));
        room406.add(new Light(4, "Ceiling Lights", 100, 70, "LED"));
        room406.add(new Projector(5, "Class Projector", 300, "1080p", "LCD"));

        List<EnergyReading> reading406 = new ArrayList<>();

        rooms.add(new Room(1, "406", 4, room406, reading406));
        
        //Room 201
        List<Equipment> room201 = new ArrayList<>();
        room201.add(new Light(6, "Front Light", 50, 80, "LED"));
        room201.add(new AirConditioner(7, "Ductless AC", 1500, 25));
        room201.add(new AirConditioner(8, "Ductless AC", 1500, 18));
        room201.add(new AirConditioner(9, "Cassette AC", 2000, 16));
        room201.add(new AirConditioner(10, "Cassette AC", 2000, 20));
        room201.add(new Light(11, "Main Lights", 100, 75, "LED"));
        room201.add(new Projector(12, "Class Projector", 300, "1080p", "LCD"));

        List<EnergyReading> reading201 = new ArrayList<>();

        rooms.add(new Room(2, "201", 2, room201, reading201));

        return rooms;

    }

    public List<EnergyReading> getAllReadings() {
        return generateReadings();
    }

    private List<EnergyReading> generateReadings() {

        List<EnergyReading> readings = new ArrayList<>();
        
        
        readings.add(new EnergyReading(1,rooms.get(0),"2026-04-25","08:30",22.0));
        readings.add(new EnergyReading(2,rooms.get(0),"2026-04-25","10:00",28.0));
        readings.add(new EnergyReading(3,rooms.get(0),"2026-04-25","11:30",24.0));

        
        readings.add(new EnergyReading(4,rooms.get(1),"2026-04-25","13:30",30.0));
        readings.add(new EnergyReading(5,rooms.get(1),"2026-04-25","15:00",35.0));
        readings.add(new EnergyReading(6,rooms.get(1),"2026-04-25","16:30",32.0));

        return readings;
    }

}
