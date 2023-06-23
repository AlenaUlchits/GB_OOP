package hw3;

import java.util.Comparator;
public class PriceComparator<H> implements Comparator<HotDrink> {
    @Override
    public int compare(HotDrink o1, HotDrink o2) {
        return Double.compare(o2.calculatePrice(), o1.calculatePrice());
    }
}
