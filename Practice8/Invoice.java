public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double price;

    public Invoice() {
        partNumber = "";
        partDescription = "";
        quantity = 0;
        price = 0;
    }

    public Invoice(String partNumber, String partDescription, int quantity, double price) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity > 0 ? quantity : 0;
        this.price = price > 0 ? price : 0;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity > 0 ? quantity : 0;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price > 0 ? price : 0;
    }

    public double getInvoiceAmount() {
        return price * quantity;
    }
}

class InvoiceTest {
    public static void main(String[] args) {
        Invoice inv = new Invoice(
            "001",
            "nails",
            5,
            4.00
        );
        System.out.printf("Part: %s%n", inv.getPartNumber());
        System.out.printf("Description: %s%n", inv.getPartDescription());
        System.out.printf("Quantity: %d%n", inv.getQuantity());
        System.out.printf("Old Price: %.2f%n%n", inv.getPrice());
        inv.setPrice(5.00);
        System.out.printf("New Price: %.2f%n", inv.getPrice());
        System.out.printf("Total: %.2f%n", inv.getInvoiceAmount());
    }
}