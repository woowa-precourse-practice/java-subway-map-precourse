package subway.inputview;

import subway.vo.SectionCommand;

import java.util.Map;

public class SectionCommendInputView implements InputView<SectionCommand> {
    @Override
    public SectionCommand getInput(Map<String, Object> model) {
        String input = readInput();
        return SectionCommand.findByCommand(input);
    }
}
