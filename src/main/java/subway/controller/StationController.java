package subway.controller;

import subway.inputview.InputView;
import subway.outputview.OutputView;
import subway.service.StationService;
import subway.system.ControllerName;
import subway.vo.StationCommand;

import java.util.Map;

public class StationController implements Controller {
    private final OutputView outputView;
    private final InputView<StationCommand> inputView;

    public StationController(OutputView outputView, InputView<StationCommand> inputView) {
        this.outputView = outputView;
        this.inputView = inputView;
    }

    @Override
    public void process(Map<String, Object> model) {
        outputView.print(model);
        StationCommand stationCommand = inputView.getInput(model);
        saveStation(model, stationCommand);
        deleteStation(model, stationCommand);
        findAllStations(model, stationCommand);
    }

    private static void findAllStations(Map<String, Object> model, StationCommand stationCommand) {
        if (stationCommand == StationCommand.FIND) {
            ControllerHolder.get(ControllerName.STATION_FIND).process(model);
        }
    }

    private static void deleteStation(Map<String, Object> model, StationCommand stationCommand) {
        if (stationCommand == StationCommand.DELETE) {
            ControllerHolder.get(ControllerName.STATION_DELETE).process(model);
        }
    }

    private static void saveStation(Map<String, Object> model, StationCommand stationCommand) {
        if (stationCommand == StationCommand.SAVE) {
            ControllerHolder.get(ControllerName.STATION_SAVE).process(model);
        }
    }
}
