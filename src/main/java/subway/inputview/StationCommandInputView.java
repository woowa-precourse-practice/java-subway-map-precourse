package subway.inputview;

import subway.vo.StationCommand;

import java.util.Map;

public class StationCommandInputView implements InputView<StationCommand> {
    @Override
    public StationCommand getInput(Map<String, Object> model) {
        String input = readInput();
        return StationCommand.findByCommand(input);
    }
}
