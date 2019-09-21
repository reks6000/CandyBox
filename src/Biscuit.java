public class Biscuit extends SweetThing {
    private String biscuit_special;

    public Biscuit () {
        super();
        this.biscuit_special = "";
    }

    public Biscuit (String name, double weight, double price, String biscuit_special) {
        super(name, weight, price);
        this.biscuit_special = biscuit_special;
    }

    public String toString() {
        return getClass().getName() + "@" + super.toString() + biscuit_special;
    }
}
