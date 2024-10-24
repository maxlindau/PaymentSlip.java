import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); 

        System.out.print("namn på anställd");
        String name = scanner.nextLine();

        System.out.print("hourly rate"); 
        int hourlyRate = scanner.nextInt();

        System.out.print("hours worked");
        int hours = scanner.nextInt(); 

        scanner.close();

        PaymentSlip paymentSlip = new PaymentSlip(name, hourlyRate, hours); 
        paymentSlip.paymentSlip();

    }
}
