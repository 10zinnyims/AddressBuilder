import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        StringBuilder info = new StringBuilder();

        System.out.println("Full name: ");
        String fullName = userInput.nextLine();

        System.out.print("Billing Street: ");
        String billingStreet = userInput.nextLine();
        System.out.print("Billing City: ");
        String billingCity = userInput.nextLine();
        System.out.print("Billing State: ");
        String billingState = userInput.nextLine();
        System.out.print("Billing Zip: ");
        String billingZip = userInput.nextLine();

        System.out.print("Shipping Street: ");
        String shipStreet = userInput.nextLine();
        System.out.print("Shipping City: ");
        String shipCity = userInput.nextLine();
        System.out.print("Shipping State: ");
        String shipState = userInput.nextLine();
        System.out.print("Shipping Zip: ");
        String shipZip = userInput.nextLine();

        info.append(fullName).append("\n");
        info.append("Billing Address:\n");
        info.append(billingCity).append(", ").append(billingState).append(" ").append(billingZip).append("\n");
        info.append("Shipping Address:\n");
        info.append(shipStreet).append("\n");
        info.append(shipCity).append(", ").append(shipState).append(" ").append(shipZip);

        String finalOutput = info.toString();
        System.out.print(finalOutput);

    }
}
