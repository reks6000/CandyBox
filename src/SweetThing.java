public abstract class SweetThing {
    private String name;
    private double weight;
    private double price;

    public SweetThing () {
        this.name = "";
        this.weight = 0;
        this.price = 0;
    }

    public SweetThing (String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public double getWeight () {
        return this.weight;
    }
    public double getPrice () {
        return this.price;
    }
    public String toString() {
        return this.name + ", " + this.weight + "gr., " + this.price + "$, ";
    }
}
