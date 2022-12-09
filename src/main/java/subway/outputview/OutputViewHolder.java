package subway.outputview;

import java.util.HashMap;
import java.util.Map;

public class OutputViewHolder {
    private static final Map<OutputViewName, OutputView> outputViews = new HashMap<>();

    static {
        outputViews.put(OutputViewName.MAIN, new MainOutputView());
        outputViews.put(OutputViewName.STATIONCOMMAND, new StationCommandOutputView());
    }

    public static OutputView get(OutputViewName outputViewName) {
        return outputViews.get(outputViewName);
    }
}
