import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double usdRate = 83.12;
        double euroRate = 90.45;
        double poundRate = 105.30;

        System.out.println(" Currency Converter ");

        System.out.println("Available Currencies:");
        System.out.println("1. INR");
        System.out.println("2. USD");
        System.out.println("3. EURO");
        System.out.println("4. GBP");


        System.out.print("\nChoose Base Currency (1-4): ");
        int base = sc.nextInt();


        System.out.print("Choose Target Currency (1-4): ");
        int target = sc.nextInt();


        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        double amountInINR = 0;
        double convertedAmount = 0;


        switch (base) {

            case 1:
                amountInINR = amount;
                break;

            case 2:
                amountInINR = amount * usdRate;
                break;

            case 3:
                amountInINR = amount * euroRate;
                break;

            case 4:
                amountInINR = amount * poundRate;
                break;

            default:
                System.out.println("Invalid Base Currency");
                return;
        }

        switch (target) {

            case 1:
                convertedAmount = amountInINR;
                System.out.println("\nConverted Amount: ₹" + convertedAmount);
                break;

            case 2:
                convertedAmount = amountInINR / usdRate;
                System.out.println("\nConverted Amount: $" + convertedAmount);
                break;

            case 3:
                convertedAmount = amountInINR / euroRate;
                System.out.println("\nConverted Amount: €" + convertedAmount);
                break;

            case 4:
                convertedAmount = amountInINR / poundRate;
                System.out.println("\nConverted Amount: £" + convertedAmount);
                break;

            default:
                System.out.println("Invalid Target Currency");
        }

        sc.close();
    }
}
