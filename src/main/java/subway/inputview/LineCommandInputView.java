package subway.inputview;

import subway.vo.LineCommand;

import java.util.Map;

public class LineCommandInputView implements InputView<LineCommand> {
    @Override
    public LineCommand getInput(Map<String, Object> model) {
        String input = readInput();
        return LineCommand.findByCommand(input);
    }
}
