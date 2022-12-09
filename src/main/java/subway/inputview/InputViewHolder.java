package subway.inputview;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InputViewHolder {
    private static final Map<InputViewName, InputView> inputViews = new HashMap<>();

    static {
        inputViews.put(InputViewName.MAIN, new MainInputView());
    }

    public static InputView get(InputViewName inputViewName) {
        return inputViews.get(inputViewName);
    }
}
