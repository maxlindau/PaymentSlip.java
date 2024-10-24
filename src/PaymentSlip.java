public class PaymentSlip {
    // instance variables
    private String name;
    private int hourlyRate;
    private int hours;

    private static final double TaxRate = 0.7;

    // default constructor
    public PaymentSlip() {
    }

    // parameterized constructor
    public PaymentSlip(String name, int hourlyRate, int hours) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    // getters
    public String getName(){
        return name;
    }

    public int hourlyRate(){
        return hourlyRate;
    }

    public int hours(){
        return hours;
    }

    // setters

    public void setName(String name){
        this.name = name;
    }

    public void setHourlyRate(int hourlyRate){
        this.hourlyRate = hourlyRate;
    }

    public void setHours(int hours){
        this.hours = hours;
    }

    // calculate salary

    public int calculateSalary(){
        return this.hourlyRate * this.hours;
    }

    public double calculateNetSalary(){
    return calculateSalary() * TaxRate;
    }

    // print payment slip

    public void paymentSlip(){
        System.out.println("\n--------------------");
        System.out.println("## PAYMENT INFORMATION ##");
        System.out.println("Name: \t\t\t" + this.name);
        System.out.println("Hourly rate: \t\t" + this.hourlyRate);
        System.out.println("Hours worked: \t\t" + this.hours);
        System.out.println();
        System.out.println("Salary before tax: \t$" + calculateSalary());
        System.out.println("Salary after tax: \t$" + calculateNetSalary());
        System.out.println();
        System.out.println("If you have any questions regarding your salary, contact Bob");
        System.out.println("--------------------\n");

    }
}
