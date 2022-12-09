package subway.inputview;

import java.util.Map;

public class LineFirstStationToSaveInputView implements InputView<String> {
    @Override
    public String getInput(Map<String, Object> model) {
        return readInput();
    }
}
