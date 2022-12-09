package subway.inputview;

import java.util.Map;
import java.util.Scanner;

public interface InputView<E> {
    E getInput(Map<String, Object> model);

    default String readInput() {
        final Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
