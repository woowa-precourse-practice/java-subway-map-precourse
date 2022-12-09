package subway;

import subway.system.FrontController;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        FrontController frontController = new FrontController();
        frontController.run();
    }
}
