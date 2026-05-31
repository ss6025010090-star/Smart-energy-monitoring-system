package model;
import java.util.List;

import interfaces.Displayable;

public class Room implements Displayable{

    private int id;
    private String number;
    private int floor;
    
    private List<Equipment> equipmentList;
    private List<EnergyReading> energyReadings;


    public Room(int id, String number, int floor, List<Equipment> equipmentList, List<EnergyReading> energyReadings) {
        setId(id);
        setNumber(number);
        setFloor(floor);
        setEquipmentList(equipmentList);
        setEnergyReadings(energyReadings);
    }

    public int getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public int getFloor() {
        return floor;
    }

    public List<Equipment> getEquipmentList() {
        return equipmentList;
    }

    public List<EnergyReading> getEnergyReadings() {
        return energyReadings;
    }
    
    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        }
    }

    public void setNumber(String number) {
        if (number != null && !number.isEmpty()) {
            this.number = number;
        }
    }

    public void setFloor(int floor) {
        if (floor >= 0) {
            this.floor = floor;
        }
    }

    public void setEquipmentList(List<Equipment> equipmentList) {
        if (equipmentList != null)
            this.equipmentList = equipmentList;
    }

    public void setEnergyReadings(List<EnergyReading> energyReadings) {
        if (energyReadings != null) {
            this.energyReadings = energyReadings;
        }
    }

    public void addEquipment(Equipment equipment) {
        if (equipmentList != null) {
            equipmentList.add(equipment);
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Room " + number + " | Floor " + floor);
    }

    @Override
    public String toString() {
        return "Room " + number + " (Floor " + floor + ")";
    }
}
