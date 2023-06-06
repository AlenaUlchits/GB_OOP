package hw1;

import java.util.List;

public interface IVendingMachine {
    void getProductInfo(List<HotDrink> drinks, String drinkTypeName);

    void  getProductInfo(List<HotDrink> drinks, double volume);

}
