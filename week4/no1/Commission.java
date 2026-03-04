package week4.no1;

public class Commission extends Hourly{
    private double CommissionRate;
    private double TotalSales;

    public Commission(String nama, String alamat, String phone, String socialSecurityNumber, double payRate, double CommissionRate){
        super(nama, alamat, phone, socialSecurityNumber, payRate);
        this.CommissionRate = CommissionRate;
    }
    public void addSales(double totalSales){
        TotalSales += totalSales;
    }
    @Override
    public double pay() {
        double pembayaran = super.pay() + (CommissionRate * TotalSales);
        TotalSales = 0;
        return pembayaran;
    }
    @Override
    public String toString() {
    return super.toString() + "\ntotal sales: " + TotalSales;    
    }
}
