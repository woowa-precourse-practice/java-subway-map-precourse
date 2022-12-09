package subway.outputview;

import java.util.HashMap;
import java.util.Map;

public class OutputViewHolder {
    private static final Map<OutputViewName, OutputView> outputViews = new HashMap<>();

    static {
        outputViews.put(OutputViewName.MAIN, new MainOutputView());
        initializeStationOutputViews();
        outputViews.put(OutputViewName.LINE_COMMAND, new LineCommandOutputView());
        outputViews.put(OutputViewName.LINE_SAVE, new LineNameToSaveOutputView());
        outputViews.put(OutputViewName.LINE_SAVE_FIRST_STATION, new LineFirstStationToSaveOutputView());
        outputViews.put(OutputViewName.LINE_SAVE_LAST_STATION, new LineLastStationToSaveOutputView());
        outputViews.put(OutputViewName.LINE_DELETE, new LineToDeleteOutputView());
        outputViews.put(OutputViewName.LINE_DELETE_COMPLETE, new LineDeletingCompletedOutputView());
        outputViews.put(OutputViewName.FIND_ALL_LINES, new FindingAllLinesOutputView());
    }

    private static void initializeStationOutputViews() {
        outputViews.put(OutputViewName.STATION_COMMAND, new StationCommandOutputView());
        outputViews.put(OutputViewName.STATION_TO_SAVE, new StationToSaveOutputView());
        outputViews.put(OutputViewName.STATION_TO_DELETE, new StationToDeleteOutputView());
        outputViews.put(OutputViewName.FIND_ALL_STATIONS, new FindingAllStationdOutpurView());
    }

    public static OutputView get(OutputViewName outputViewName) {
        return outputViews.get(outputViewName);
    }
}
