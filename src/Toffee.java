public class Toffee extends SweetThing {
    private boolean toffee_special;

    public Toffee () {
        super();
        this.toffee_special = false;
    }

    public Toffee (String name, double weight, double price, boolean toffee_special) {
        super(name, weight, price);
        this.toffee_special = toffee_special;
    }

    public String toString() {
        return getClass().getName() + "@" + super.toString() + toffee_special;
    }
}
