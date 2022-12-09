package subway.inputview;

import subway.vo.MainCommand;

import java.util.Map;

public class MainInputView implements InputView<MainCommand> {
    @Override
    public MainCommand getInput(Map<String, Object> model) {
        String input = readInput();
        return MainCommand.findByCommand(input);
    }
}
