package subway.inputview;

import java.util.HashMap;
import java.util.Map;

public class InputViewHolder {
    private static final Map<InputViewName, InputView> inputViews = new HashMap<>();

    static {
        inputViews.put(InputViewName.MAIN, new MainInputView());
        initializeStationInputViews();
        initializeLineInputViews();
        inputViews.put(InputViewName.SECTION_COMMAND, new SectionCommendInputView());
        inputViews.put(InputViewName.SECTION_ORDER, new SectionOrderInputView());
    }

    private static void initializeLineInputViews() {
        inputViews.put(InputViewName.LINE_COMMAND, new LineCommandInputView());
        inputViews.put(InputViewName.LINE_NAME, new LineNameInputView());
        inputViews.put(InputViewName.LINE_STATION, new LineFirstStationToSaveInputView());
    }

    private static void initializeStationInputViews() {
        inputViews.put(InputViewName.STATION_COMMAND, new StationCommandInputView());
        inputViews.put(InputViewName.STATION_INFO, new StationInfoInputView());
    }

    public static InputView get(InputViewName inputViewName) {
        return inputViews.get(inputViewName);
    }
}
