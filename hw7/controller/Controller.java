package hw7.controller;

import hw7.model.ComplexNumber;
import hw7.service.ComplexNumOperationsService;
import hw7.view.View;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controller {
    private View view;
    private Logger logger;

    private ComplexNumOperationsService complexOperations;

    public Controller(View view) {
        this.view = view;
    }

    public void buttonClick() {
        logger = Logger.getAnonymousLogger();
        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler("log.txt", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.addHandler(fileHandler);
        try {
            ComplexNumber c1 = new ComplexNumber(view.inputValue("Re: "), view.inputValue("Im: "));

            char operation = view.inputOperationSign("Operation Sign: ");

            ComplexNumber c2 = new ComplexNumber(view.inputValue("Re: "), view.inputValue("Im: "));

            switch (operation) {
                case '+' -> {
                    ComplexNumber result = complexOperations.add(c1, c2);
                    result.printNumber();
                    logger.log(Level.INFO, c1 + " + " + c2 + " = " + result);
                }
                case '-' -> {
                    ComplexNumber result = complexOperations.subtraction(c1, c2);
                    result.printNumber();
                    logger.log(Level.INFO, c1 + " - " + c2 + " = " + result);
                }
                case '*' -> {
                    ComplexNumber result = complexOperations.multiplication(c1, c2);
                    result.printNumber();
                    logger.log(Level.INFO, c1 + " * " + c2 + " = " + result);
                }
                case '/' -> {
                    ComplexNumber result = complexOperations.division(c1, c2);
                    result.printNumber();
                    logger.log(Level.INFO, c1 + " / " + c2 + " = " + result);
                }
                default -> logger.log(Level.WARNING, "Unexpected sign: " + operation);
            }
            fileHandler.close();
        } catch (InputMismatchException ex) {
            logger.log(Level.WARNING, "Data is incorrect. Try again.");
        }
    }
}
