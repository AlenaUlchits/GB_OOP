package hw1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){
        IVendingMachine vendingMachine = new VendingMachineImpl();

        List<HotDrink> drinks = new ArrayList<>();
        Random rand = new Random();

        for(int i = 1; i <= 3; i++){
            HotDrink hotDrink = new HotDrink();
            hotDrink.setName("Hot Drink" + i);
            hotDrink.setBrand("Brand" + i);
            hotDrink.setVolume(i*100);
            hotDrink.setPrice(i*2.5);
            drinks.add(hotDrink);
        }
        for(int i = 1; i <= 3; i++){
            Coffee coffee = new Coffee();
            coffee.setName("Coffee" + i);
            coffee.setBrand("Brand" + i);
            coffee.setWithMilk(rand.nextBoolean());
            coffee.setTemperature((i+100)*1.5);
            coffee.setVolume(i*100);
            coffee.setPrice(i*2.5);
            drinks.add(coffee);
        }
        for(int i = 1; i <= 3; i++){
            Tea tea = new Tea();
            tea.setName("Tea" + i);
            tea.setBrand("Brand" + i);
            tea.setTemperature((i+100)*1.5);
            tea.setType(i%2!=0?"Black":"Green");
            tea.setVolume(i*100);
            tea.setPrice(i*2.5);
            drinks.add(tea);
        }
        for(int i = 1; i <= 3; i++){
            HotChocolate hotChocolate = new HotChocolate();
            hotChocolate.setName("Hot chocolate" + i);
            hotChocolate.setBrand("Brand" + i);
            hotChocolate.setTemperature((i+100)*1.5);
            hotChocolate.setVolume(i*100);
            hotChocolate.setPrice(i*2.5);
            drinks.add(hotChocolate);
        }
        System.out.println("Products with what volume do you want to get (100, 200, 300)?");
        Scanner sc = new Scanner(System.in);
        vendingMachine.getProductInfo(drinks, sc.nextDouble());
        System.out.println("Information about what products do you want to know (hot drinks, hot chocolate, " +
                "tea or coffee)?");
        vendingMachine.getProductInfo(drinks, sc.next());

    }
}