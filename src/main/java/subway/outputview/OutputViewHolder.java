package subway.outputview;

import java.util.HashMap;
import java.util.Map;

public class OutputViewHolder {
    private static final Map<OutputViewName, OutputView> outputViews = new HashMap<>();

    static {
        outputViews.put(OutputViewName.MAIN, new MainOutputView());
        outputViews.put(OutputViewName.STATION_COMMAND, new StationCommandOutputView());
        outputViews.put(OutputViewName.STATION_TO_SAVE, new StationToSaveOutputView());
        outputViews.put(OutputViewName.STATION_TO_DELETE, new StationToDeleteOutputView());
        outputViews.put(OutputViewName.FIND_ALL_STATIONS, new FindingAllStationdOutpurView());
        outputViews.put(OutputViewName.LINE_COMMAND, new LineCommandOutputView());
    }

    public static OutputView get(OutputViewName outputViewName) {
        return outputViews.get(outputViewName);
    }
}
