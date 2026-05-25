package service;
import model.ElectricityBill;
import model.EnergyReport;

public class BillService {

    private double pricePerKWh = 0.15;

    public double calculateTotalBill(double totalUsage) {
        return totalUsage * pricePerKWh;
    }

    public void generateBill(EnergyReport report, ElectricityBill bill, double totalKWh) {

        double cost = calculateTotalBill(totalKWh);

        bill.setTotalKWh(totalKWh);
        bill.setTotalCost(cost);
    }

    public double getPricePerKWh() {
        return pricePerKWh;
    }

    public void setPricePerKWh(double pricePerKWh) {
        if ((pricePerKWh > 0)) {
            this.pricePerKWh = pricePerKWh;
            
        }
    }
    
}
