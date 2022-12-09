package subway.controller;

import subway.inputview.InputViewHolder;
import subway.inputview.InputViewName;
import subway.outputview.OutputViewHolder;
import subway.outputview.OutputViewName;
import subway.system.ControllerName;

import java.util.HashMap;
import java.util.Map;

public class ControllerHolder {
    private static final Map<ControllerName, Controller> controllers = new HashMap<>();

    static {
        controllers.put(ControllerName.SETUP, new SetupController());
        controllers.put(ControllerName.MAIN, new MainController(
                InputViewHolder.get(InputViewName.MAIN),
                OutputViewHolder.get(OutputViewName.MAIN)
        ));
        controllers.put(ControllerName.STATION, new StationController(
                OutputViewHolder.get(OutputViewName.STATION_COMMAND),
                InputViewHolder.get(InputViewName.STATION_COMMAND)
        ));
        initializeStationControllers();
        controllers.put(ControllerName.LINE, new LineController(
                OutputViewHolder.get(OutputViewName.LINE_COMMAND),
                InputViewHolder.get(InputViewName.LINE_COMMAND)
        ));
        controllers.put(ControllerName.LINE_SAVE, new SavingLineController());
    }

    private static void initializeStationControllers() {
        controllers.put(ControllerName.STATION_SAVE, new SavingStationController(
                OutputViewHolder.get(OutputViewName.STATION_TO_SAVE),
                InputViewHolder.get(InputViewName.STATION_INFO)
        ));
        controllers.put(ControllerName.STATION_DELETE, new DeletingStationController(
                OutputViewHolder.get(OutputViewName.STATION_TO_DELETE),
                InputViewHolder.get(InputViewName.STATION_INFO)
        ));
        controllers.put(ControllerName.STATION_FIND, new FindingStationController(
                OutputViewHolder.get(OutputViewName.FIND_ALL_STATIONS)
        ));
    }

    public static Controller get(ControllerName controllerName) {
        return controllers.get(controllerName);
    }
}
