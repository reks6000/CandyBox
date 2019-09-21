public class Candy extends SweetThing {
    private int candy_special;

    public Candy () {
        super();
        this.candy_special = 0;
    }

    public Candy (String name, double weight, double price, int candy_special) {
        super(name, weight, price);
        this.candy_special = candy_special;
    }

    public String toString() {
        return getClass().getName() + "@" + super.toString() + candy_special;
    }
}
