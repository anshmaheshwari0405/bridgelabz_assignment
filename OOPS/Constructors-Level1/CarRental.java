public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double costPerDay=50.0;
    public CarRental(String customerName,String carModel,int rentalDays){
        this.customerName=customerName; this.carModel=carModel; this.rentalDays=rentalDays;
    }
    public double totalCost(){ return rentalDays*costPerDay; }
    public String toString(){ return customerName+" "+carModel+" "+rentalDays+" days Cost:"+totalCost(); }
}
