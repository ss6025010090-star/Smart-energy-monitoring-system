package model;

public class ElectricityBill {

    private EnergyReport report;
    private double pricePerKWh;
    private double totalKWh;
    private double totalCost;

    public ElectricityBill(EnergyReport report, double pricePerKWh) {
        setReport(report);
        setPricePerKWh(pricePerKWh);
    }


    public EnergyReport getReport() {
        return report;
    }

    public double getPricePerKWh() {
        return pricePerKWh;
    }

    public double getTotalKWh() {
        return totalKWh;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setReport(EnergyReport report) {
        this.report = report;
    }

    public void setPricePerKWh(double pricePerKWh) {
        if (pricePerKWh > 0) {
            this.pricePerKWh = pricePerKWh;
        }
    }

    public void setTotalKWh(double totalKWh) {
        this.totalKWh = totalKWh;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    
}
