package Practice9;

public class Purse {
    private int nickel;
    private int dime;
    private int quarter;

    public Purse() {
        nickel = 0;
        dime = 0;
        quarter = 0;
    }

    public Purse(int nickel, int dime, int quarter) {
        this.nickel = nickel;
        this.dime = dime;
        this.quarter = quarter;
    }

    public int getNickel() {
        return nickel;
    }

    public void setNickel(int nickel) {
        this.nickel = nickel;
    }

    public int getDime() {
        return dime;
    }

    public void setDime(int dime) {
        this.dime = dime;
    }

    public int getQuarter() {
        return quarter;
    }

    public void setQuarter(int quarter) {
        this.quarter = quarter;
    }

    public double inDollar() {
        return 0.05 * nickel + 0.1 * dime + 0.25 * quarter;
    }

    public void insert(int nickel, int dime, int quarter) {
        this.nickel += nickel;
        this.dime += dime;
        this.quarter += quarter;
    }

    public void remove(int nickel, int dime, int quarter) {
        this.nickel -= nickel;
        this.dime -= dime;
        this.quarter -= quarter;
    }

    public static Purse addPurses(Purse p1, Purse p2) {
        return new Purse(
            p1.getNickel() + p2.getNickel(),
            p1.getDime() + p2.getDime(),
            p1.getQuarter() + p2.getQuarter()
        );
    }

    public void addToPurse(Purse p) {
        nickel += p.getNickel();
        dime += p.getDime();
        quarter += p.getQuarter();
    }

    public String toString() {
        return String.format("Nickel: %d, Dime: %d, Quarter: %d", nickel, dime, quarter);
    }
}

class PurseTester {
    public static void main(String[] args) {
        Purse p1 = new Purse(6, 8, 12);

        System.out.printf("Purse p1: %s%n", p1);
        System.out.printf("Value of purse p1: $%.2f%n", p1.inDollar());

        Purse p2 = new Purse(4, 5, 8);

        System.out.printf("Purse p2: %s%n", p2);
        System.out.printf("Value of purse p2: $%.2f%n", p2.inDollar());

        p1.insert(3, 6, 5);
        p2.remove(2, 3, 4);

        System.out.printf("Purse p1 after inserting coins: %s%n", p1);
        System.out.printf("Purse p2 after removing coins: %s%n", p2);

        System.out.printf("Adding p1 and p2: %s%n", Purse.addPurses(p1, p2));

        p2.addToPurse(p1);
        System.out.printf("Adding p1 to p2: %s%n%n", p2);

        System.out.printf("Final value of 2 purses: $%.2f%n", p2.inDollar());
    }
}