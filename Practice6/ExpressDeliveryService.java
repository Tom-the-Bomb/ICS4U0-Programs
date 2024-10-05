
package Practice6;

import java.util.*;

public class ExpressDeliveryService {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type of Package:\t");
        String pkg = sc.nextLine().toLowerCase();
        System.out.print("Type of Service:\t");
        String service = sc.nextLine().toLowerCase();
        System.out.print("Weight of Package (oz):\t");
        int weight = sc.nextInt();
        sc.close();

        System.out.println();

        double cost;
        switch (pkg) {
            case "letter":
                if (weight > 8) {
                    System.err.println("This service is not available for weights over 8 oz.");
                    return;
                }
                switch (service) {
                    case "next day priority":
                        cost = 12;
                        break;
                    case "next day standard":
                        cost = 10.5;
                        break;
                    default:
                        System.out.println("This service is not available");
                        return;
                }
                break;
            case "box":
                if (weight < 8) {
                    System.err.println("This service is not available for weights under 8 oz.");
                    return;
                }
                switch (service) {
                    case "next day priority":
                        cost = 15.75 + ((weight - 16) / 16) * 1.25;
                        break;
                    case "next day standard":
                        cost = 13.75 + (weight - 16) / 16;
                        break;
                    case "two-day":
                    case "two day":
                        cost = 7 + ((weight - 16) / 16) * 0.5;
                        break;
                    default:
                        System.out.println("This service is not available");
                        return;
                }
                break;
            default:
                System.out.println("This type of package is not available");
                return;
        }

        System.out.printf("Cost of delivery:\t$%.2f", cost);
    }
}