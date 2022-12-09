package subway.inputview;

import java.util.HashMap;
import java.util.Map;

public class InputViewHolder {
    private static final Map<InputViewName, InputView> inputViews = new HashMap<>();

    static {
        inputViews.put(InputViewName.MAIN, new MainInputView());
        inputViews.put(InputViewName.STATION_COMMAND, new StationCommandInputView());
        inputViews.put(InputViewName.STATION_INFO, new StationInfoInputView());
        inputViews.put(InputViewName.LINE_COMMAND, new LineCommandInputView());
    }

    public static InputView get(InputViewName inputViewName) {
        return inputViews.get(inputViewName);
    }
}
