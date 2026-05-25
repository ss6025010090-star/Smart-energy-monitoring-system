package model;

import interfaces.Calculatable;
import interfaces.Displayable;



public class EnergyReading implements Displayable, Calculatable {
    private int id;
    private Room room;
    private String date;
    private String time;
    private double kWh;

    private static int count = 0;
    //Constructor 
    public EnergyReading(int id, Room room, String date, String time, double kWh) {
        setId(id);
        setRoom(room);
        this.date = cleanText(date, "No Date");
        this.time = cleanText(time, "No Time");
        setKwh(kWh);
        count++; 
    }


    private String cleanText(String value, String defaultValue) {
        if (value == null || value.trim().isEmpty()) {
            return defaultValue;
        }
        return value.trim();
    }


    public int getId() {
        return id;
    }
    public Room getRoom() {
        return room;
    }
    public String getDate() {
        return date;
    }
    public String getTime() {
        return time;
    }
    public double getKWh() {
        return kWh;
    }
    public static int getCount() {
        return count;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            this.id = 0;
        }
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void setDate(String date) {
        this.date = cleanText(date, "No Date");
    }

    public void setTime(String time) {
        this.time = cleanText(time, "No Time");
    }

    public void setKwh(double kWh) {
        if (kWh >= 0) {
            this.kWh = kWh;
        } else {
            this.kWh = 0;
        }
    }

    @Override
    public double calculate() {
        return kWh;
    }
    

    @Override
    public void displayInfo() {
        System.out.println(this.toString());
    }


    //toString: convert object to texts that we can read
    @Override
    public String toString() {
        String roomNumber;

        if (room != null) {
            roomNumber = room.getNumber();
        } else {
            roomNumber = "No Room";
        }

        return "Room: " + roomNumber +
               " | Date: " + date +
               " | Time: " + time +
               " | Usage: " + kWh + " kWh";
    }
}
