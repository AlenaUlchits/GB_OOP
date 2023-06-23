package hw3;

import java.util.List;

public interface IVendingMachine {
    void getProductInfo(List<HotDrink> drinks, String drinkTypeName);

    void  getProductInfo(List<HotDrink> drinks, Double volume);

}
