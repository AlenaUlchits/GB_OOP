package hw3;

import java.util.List;

public class VendingMachineImpl implements IVendingMachine {
    public void getProductInfo(List<HotDrink> drinks, String drinkTypeName){
        if(!drinks.isEmpty()) {
            switch (drinkTypeName.toLowerCase()) {
                case "hot drink":
                    drinks.forEach(d -> System.out.println(d.showProdInfo()));
                    break;
                case "hot chocolate":
                    drinks.stream().filter(d -> d instanceof HotChocolate)
                            .forEach(hc -> {
                                HotChocolate hotc = (HotChocolate) hc;
                                System.out.println(hotc.showProdInfo());
                            });
                    break;
                case "tea":
                    drinks.stream().filter(d -> d instanceof Tea)
                            .forEach(t -> {
                                Tea tea= (Tea) t;
                                System.out.println(tea.showProdInfo());
                            });
                    break;
                case "coffee":
                    drinks.stream().filter(d -> d instanceof Coffee)
                            .forEach(c -> {
                                Coffee cof = (Coffee) c;
                                System.out.println(cof.showProdInfo());
                            }
                            );
                    break;
                default:
                    System.out.println("There is no such type of drinks in your machine.");
                    break;
            }
        }else{
            System.out.println("There is no drinks in your machine. Try a bit later.");
        }
    }

    public void  getProductInfo(List<HotDrink> drinks, Double volume){
        if(!drinks.isEmpty() && drinks.stream().anyMatch(d -> d.getVolume() == volume)) {
            drinks.stream().filter(d -> d.getVolume() == volume)
                    .forEach(hd -> {
                        if(hd instanceof HotChocolate){
                            HotChocolate hotc = (HotChocolate) hd;
                             System.out.println(hotc.showProdInfo());
                        }
                        if(hd instanceof Tea){
                            Tea t = (Tea) hd;
                            System.out.println(t.showProdInfo());
                        }
                        if(hd instanceof Coffee){
                            Coffee c = (Coffee) hd;
                           System.out.println(c.showProdInfo());
                        }
                         System.out.println(hd.showProdInfo());
                    }
                    );
        }else{
            System.out.println("Sorry we don't have any drinks with such volume.");
        }
    }
}
