package hw2;

import java.util.Scanner;

public class MainProg {
    public static void main(String[] args){
        Element num = new Element();
        Scanner sc = new Scanner(System.in);
        Integer operation = -1;
        while(operation!=0){
            System.out.println("Enter an operation: 0: Exit, 1: Add, 2: Minus, 3: Multiple, 4: Divide");
            operation = sc.nextInt();
            System.out.println("Enter first number: ");
            num.setFirstNum(sc.nextDouble());
            System.out.println("Enter second number: ");
            switch (operation){
                case 1:
                    System.out.println("Sum: " + num.add(sc.nextDouble()));
                    break;
                case 2:
                    System.out.println("Sum: " + num.minus(sc.nextDouble()));
                    break;
                case 3:
                    System.out.println("Sum: " + num.multiple(sc.nextDouble()));
                    break;
                case 4:
                    System.out.println("Sum: " + num.divide(sc.nextDouble()));
                    break;
                default:
                    break;
            }
        }
    }
}
