package hw3;

import java.util.*;

public class Program {

    static HotDrink generateEmployee(){
        Random rand = new Random();

        String[] names = new String[] { "Name1", "Name2", "Name3", "Name4", "Name2", "Name3", "Name1"};
        String[] brands = new String[] { "Brand1", "Brand2", "Brand3", "Brand2", "Brand1"};
        String[] types = new String[] {"Green, Black"};


        double price;
        int drinkType = rand.nextInt(3);
        switch (drinkType){
            case 0:
                price = rand.nextDouble(20000, 80000);
                return new Coffee(names[rand.nextInt(names.length)], brands[rand.nextInt(brands.length)],
                        rand.nextDouble(18, 65)*2.5, price, 50.5);
            case 1:
                price = rand.nextDouble(500, 1000);
                return new Tea(names[rand.nextInt(names.length)], brands[rand.nextInt(brands.length)],
                        rand.nextDouble(18, 65)*2.5, price,types[rand.nextInt(2)], 25.3);
            case 2: price = rand.nextDouble(100000, 200000);
                return new HotChocolate(names[rand.nextInt(names.length)], brands[rand.nextInt(brands.length)],
                        rand.nextDouble(18, 65)*2.5, price, 50.5);
        }
        return null;
    }

    static void showDrinks(HotDrink[] hotDrinks){
        for (HotDrink hotDrink: hotDrinks) {
            System.out.println(hotDrink + "\n");
        }
        System.out.println("------------------------------");
    }
    public static void main(String[] args) {

        HotDrink[] hotDrinks = new HotDrink[10];
        for (int i = 0; i < hotDrinks.length; i++)
        {
            hotDrinks[i] = generateEmployee();
        }

        Arrays.sort(hotDrinks);
        System.out.println("Sorting by name and price");
        showDrinks(hotDrinks);

        Arrays.sort(hotDrinks, new PriceComparator<HotDrink>().reversed());
        System.out.println("Price sorting");
        showDrinks(hotDrinks);

        Arrays.sort(hotDrinks, (o1, o2) -> {
            int res = o1.getBrand().compareTo(o2.getBrand());
            if (res == 0){
                return o1.getName().compareTo(o2.getName());
            }
            return res;
        });
        System.out.println("Sorting by brand and name");
        showDrinks(hotDrinks);

    }
}