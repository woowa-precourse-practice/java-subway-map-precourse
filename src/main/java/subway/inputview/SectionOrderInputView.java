package subway.inputview;

import java.util.Map;

public class SectionOrderInputView implements InputView<Integer> {
    @Override
    public Integer getInput(Map<String, Object> model) {
        return Integer.valueOf(readInput());
    }
}
