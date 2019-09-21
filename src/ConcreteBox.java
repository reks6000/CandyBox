import java.util.Arrays;

public class ConcreteBox implements SweetBox {
    private SweetThing[] sweet_arr;
    private int last_index;

    public ConcreteBox() {
        this.sweet_arr = new SweetThing[4];
        this.last_index = 0;
    }

    public void add (SweetThing sweet) {
        if (last_index == sweet_arr.length) {
            sweet_arr = Arrays.copyOf(sweet_arr, sweet_arr.length + sweet_arr.length/2);
        }
        sweet_arr[last_index] = sweet;
        last_index++;
    }

    // функция написана из расчёта, что нам не важно, чтобы функция deleteLast удаляла последний положенный объект ради скорости
    // иначе следует использовать закоментированный вариант
    public void deleteByIndex (int i) {
//        sweet_arr[i] = null;
//        for (int j = i; j < last_index-1; j++) {
//            sweet_arr[j] = sweet_arr[j+1];
//        }
//        sweet_arr[last_index-1] = null;
//        last_index--;

        sweet_arr[i] = sweet_arr[last_index-1];
        sweet_arr[last_index-1] = null;
        last_index--;
    }

    public void deleteLast () {
        sweet_arr[last_index-1] = null;
        last_index--;
    }

    public double getWeight () {
        double res = 0;
        for (int j = 0; j < last_index; j++) {
            res += sweet_arr[j].getWeight();
        }
        return res;
    }

    public double getPrice () {
        double res = 0;
        for (int j = 0; j < last_index; j++) {
            res += sweet_arr[j].getPrice();
        }
        return res;
    }

    public void printAll () {
        for (int j = 0; j < last_index; j++) {
            System.out.println(sweet_arr[j].toString());
        }
    }

    public void reduceWeight (double max_weight) {
        while (max_weight < this.getWeight()) {
            int min_weight_index = 0;
            for (int j = 1; j < last_index; j++) {
                if (sweet_arr[j].getWeight() < sweet_arr[min_weight_index].getWeight()) {
                    min_weight_index = j;
                }
            }
            this.deleteByIndex(min_weight_index);
        }
    }

    public void reducePrice (double max_price) {
        while (max_price < this.getPrice()) {
            int min_price_index = 0;
            for (int j = 1; j < last_index; j++) {
                if (sweet_arr[j].getPrice() < sweet_arr[min_price_index].getPrice()) {
                    min_price_index = j;
                }
            }
            this.deleteByIndex(min_price_index);
        }
    }
}
