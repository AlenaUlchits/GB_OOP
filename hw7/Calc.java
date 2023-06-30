package hw7;

import hw7.controller.Controller;
import hw7.view.View;

public class Calc {
    public static void main(String[] args) {
        Controller controller = new Controller(new View());
        controller.buttonClick();
    }
}
