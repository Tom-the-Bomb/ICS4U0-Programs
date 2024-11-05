package Practice11;

public class Property {
    private int available = 4;
    private int bedroom;
    private int washroom;
    private String type;

    public Property() {
        available = 0;
        bedroom = 0;
        washroom = 0;
        type = null;
    }

    public Property(int bedroom, int washroom, String type) {
        this.bedroom = bedroom;
        this.washroom = washroom;
        this.type = type;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public int getBedroom() {
        return bedroom;
    }

    public void setBedroom(int bedroom) {
        this.bedroom = bedroom;
    }

    public int getWashroom() {
        return washroom;
    }

    public void setWashroom(int washroom) {
        this.washroom = washroom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        return String.format("Bedroom: %d, Washroom: %d, Type: %s", bedroom, washroom, type);
    }
}

class PropertyTester {
    public static void main(String[] args) {
        Property[] properties = new Property[4];
        properties[0] = new Property(3, 4, "Townhouse");
        properties[1] = new Property(2, 2, "Apartment");
        properties[2] = new Property(4, 5, "Detached");
        properties[3] = new Property(1, 1, "Semi-detached");

        for (Property p : properties) {
            System.out.println(p);
        }
    }
}